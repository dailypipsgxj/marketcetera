package org.marketcetera.marketdata.core.webservice;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.ws.ContextClassProvider;

/* $License$ */

/**
 * Creates {@link MarketDataServiceClient} objects.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: MarketDataServiceClientFactory.java 16901 2014-05-11 16:14:11Z colin $
 * @since 2.4.0
 */
@ClassVersion("$Id: MarketDataServiceClientFactory.java 16901 2014-05-11 16:14:11Z colin $")
public interface MarketDataServiceClientFactory
{
    /**
     * 
     *
     *
     * @param inUsername
     * @param inPassword
     * @param inHostname
     * @param inPort
     * @param inContextClassProvider
     * @return
     */
    MarketDataServiceClient create(String inUsername,
                                   String inPassword,
                                   String inHostname,
                                   int inPort,
                                   ContextClassProvider inContextClassProvider);
    /**
     * 
     *
     *
     * @param inUsername
     * @param inPassword
     * @param inHostname
     * @param inPort
     * @return
     */
    MarketDataServiceClient create(String inUsername,
                                   String inPassword,
                                   String inHostname,
                                   int inPort);
}
