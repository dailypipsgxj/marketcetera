package org.marketcetera.photon.internal.marketdata;

import org.marketcetera.marketdata.core.webservice.MarketDataServiceClient;

import com.google.inject.ImplementedBy;

/* $License$ */

/**
 *
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: IMarketDataClientProvider.java 16901 2014-05-11 16:14:11Z colin $
 * @since 2.4.0
 */
@ImplementedBy(MarketDataManager.class)
public interface IMarketDataClientProvider
{
    MarketDataServiceClient getMarketDataClient();
}
