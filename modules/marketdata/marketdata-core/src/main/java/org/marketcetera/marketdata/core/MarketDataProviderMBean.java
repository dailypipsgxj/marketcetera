package org.marketcetera.marketdata.core;

import javax.management.MXBean;

import org.marketcetera.util.misc.ClassVersion;
import org.springframework.context.Lifecycle;

/* $License$ */

/**
 * Provides a management interface for a market data provider.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: MarketDataProviderMBean.java 16901 2014-05-11 16:14:11Z colin $
 * @since 2.4.0
 */
@MXBean(true)
@ClassVersion("$Id: MarketDataProviderMBean.java 16901 2014-05-11 16:14:11Z colin $")
public interface MarketDataProviderMBean
        extends Lifecycle
{
    /**
     * Gets the total number of market data requests submitted to this provider.
     *
     * @return an <code>int</code> value
     */
    public int getTotalRequests();
    /**
     * Gets the number of currently active market data requests.
     *
     * @return an <code>int</code> value
     */
    public int getActiveRequests();
    /**
     * Gets the total number of events produced by this provider.
     *
     * @return an <code>int</code> value
     */
    public int getTotalEvents();
    /**
     * Gets the status of the provider.
     *
     * @return a <code>ProviderStatus</code> value
     */
    public ProviderStatus getProviderStatus();
}
