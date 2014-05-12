package org.marketcetera.symbol;

import org.marketcetera.util.log.I18NLoggerProxy;
import org.marketcetera.util.log.I18NMessage0P;
import org.marketcetera.util.log.I18NMessageProvider;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Provides messages for this package.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: Messages.java 16901 2014-05-11 16:14:11Z colin $
 * @since 2.4.0
 */
@ClassVersion("$Id: Messages.java 16901 2014-05-11 16:14:11Z colin $")
public interface Messages
{
    /**
     * The message provider
     */
    static final I18NMessageProvider PROVIDER = new I18NMessageProvider("core_symbol"); //$NON-NLS-1$
    /**
     * The message logger.
     */
    static final I18NLoggerProxy LOGGER = new I18NLoggerProxy(PROVIDER);
    static final I18NMessage0P SYMBOL_RESOLVER_ERROR = new I18NMessage0P(LOGGER,"symbol_resolver_error");
    static final I18NMessage0P MISSING_SYMBOL_RESOLVERS = new I18NMessage0P(LOGGER,"missing_symbol_resolvers");
}
