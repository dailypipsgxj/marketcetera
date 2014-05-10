package org.marketcetera.core;

import junit.framework.TestSuite;
import org.marketcetera.quickfix.FIXDataDictionary;
import org.marketcetera.quickfix.FIXVersion;

import org.marketcetera.util.log.SLF4JLoggerProxy;

/**
 * @author Toli Kuznets
 * @version $Id: MarketceteraTestSuite.java 16841 2014-02-20 19:59:04Z colin $
 */
@ClassVersion("$Id: MarketceteraTestSuite.java 16841 2014-02-20 19:59:04Z colin $")
public class MarketceteraTestSuite extends TestSuite {
    public MarketceteraTestSuite() {
        super();
        init();
    }

    public MarketceteraTestSuite(Class<?> aClass) {
        super(aClass);
        init();
    }

    public void init()
    {
        try {
            FIXDataDictionary.initializeDataDictionary(FIXVersion.FIX42.getDataDictionaryURL());
        } catch (Exception ex) {
            SLF4JLoggerProxy.error(this, ex, "Error initializing suite"); //$NON-NLS-1$
            System.exit(1);
        }
    }
}
