package org.marketcetera.trade;

import javax.annotation.concurrent.Immutable;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.ws.ContextClassProvider;

/* $License$ */

/**
 * Provides context classes for trade objects.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: TradeContextClassProvider.java 16901 2014-05-11 16:14:11Z colin $
 * @since 2.4.0
 */
@Immutable
@ClassVersion("$Id: TradeContextClassProvider.java 16901 2014-05-11 16:14:11Z colin $")
public class TradeContextClassProvider
        implements ContextClassProvider
{
    /* (non-Javadoc)
     * @see org.marketcetera.util.ws.ContextClassProvider#getContextClasses()
     */
    @Override
    public Class<?>[] getContextClasses()
    {
        return CLASSES;
    }
    /**
     * static instance
     */
    public static final TradeContextClassProvider INSTANCE = new TradeContextClassProvider();
    /**
     * classes value
     */
    private static final Class<?>[] CLASSES = new Class<?>[] { Instrument.class,ReportBaseImpl.class };
}
