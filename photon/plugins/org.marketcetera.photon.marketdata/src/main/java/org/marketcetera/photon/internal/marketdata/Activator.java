package org.marketcetera.photon.internal.marketdata;

import static org.ops4j.peaberry.Peaberry.osgiModule;
import static org.ops4j.peaberry.Peaberry.service;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.marketcetera.core.instruments.UnderlyingSymbolSupport;
import org.marketcetera.module.ModuleManager;
import org.marketcetera.photon.marketdata.IMarketDataManager;
import org.marketcetera.photon.marketdata.MarketDataConstants;
import org.marketcetera.photon.module.ModuleSupport;
import org.marketcetera.util.misc.ClassVersion;
import org.osgi.framework.BundleContext;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Module;

/* $License$ */

/**
 * This class controls the plug-in life cycle and manages singleton state.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: Activator.java 16862 2014-03-19 12:28:49Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: Activator.java 16862 2014-03-19 12:28:49Z colin $")
public class Activator extends Plugin {

    /**
     * The singleton instance.
     */
    private static Activator sInstance;

    private static final String USE_FINE_GRAINED_MARKET_DATA_FOR_OPTIONS_KEY = "USE_FINE_GRAINED_MARKET_DATA_FOR_OPTIONS"; //$NON-NLS-1$

    /**
     * The {@link Executor} used by data flow managers to perform market data
     * related operations serially in a background thread.
     */
    private ExecutorService mMarketDataExecutor;

    /**
     * The {@link MarketDataManager} singleton for this plug-in instance.
     */
    private MarketDataManager mMarketDataManager;

    @Override
    public final void start(final BundleContext context) throws Exception {
        synchronized (getClass()) {
            super.start(context);
            final boolean useFineGrainedMarketDataForOptions = new InstanceScope().getNode(MarketDataConstants.PLUGIN_ID).getBoolean(USE_FINE_GRAINED_MARKET_DATA_FOR_OPTIONS_KEY,
                                                                                                                                     false);
            mMarketDataExecutor = Executors.newSingleThreadExecutor();
            final Module module = new AbstractModule() {
                @Override
                protected void configure() {
                    bind(ModuleManager.class).toInstance(
                            ModuleSupport.getModuleManager());
                    bind(IMarketDataRequestSupport.class).toInstance(
                            new MarketDataRequestSupport(
                                    useFineGrainedMarketDataForOptions));
                    bind(UnderlyingSymbolSupport.class).toProvider(
                            service(UnderlyingSymbolSupport.class).single()
                                    .direct());
                }
            };
            mMarketDataManager = Guice.createInjector(osgiModule(context),
                                                      module).getInstance(MarketDataManager.class);
            // service is unregistered during stop
            context.registerService(IMarketDataManager.class.getName(),
                                    mMarketDataManager,
                                    null);
            sInstance = this;
        }
    }

    @Override
    public final void stop(final BundleContext context) throws Exception {
        synchronized (getClass()) {
            sInstance = null;
            mMarketDataManager = null;
            if (mMarketDataExecutor != null) {
                mMarketDataExecutor.shutdownNow();
                mMarketDataExecutor = null;
            }
            super.stop(context);
        }
    }

    /**
     * Returns the market data manager for the singleton plug-in.
     * 
     * @return the market data manager, or null if the plug-in is not active
     */
    public static MarketDataManager getMarketDataManager() {
        synchronized (Activator.class) {
            return sInstance == null ? null : sInstance.mMarketDataManager;
        }
    }
}
