package org.marketcetera.marketdata.core;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Indicates the status of a market data provider feed.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: ProviderStatus.java 16901 2014-05-11 16:14:11Z colin $
 * @since 2.4.0
 */
@ClassVersion("$Id: ProviderStatus.java 16901 2014-05-11 16:14:11Z colin $")
public enum ProviderStatus
{
    /**
     * Feed is off-line -it may be started to be made available
     */
    OFFLINE,
    /**
     * Feed is off-line due to a problem - it may be restarted, but the start may not succeed 
     */
    ERROR,
    /**
     * Feed is available for requests
     */
    AVAILABLE,
    /**
     * Status of the feed is unknown
     */
    UNKNOWN;
}
