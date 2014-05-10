package org.marketcetera.photon.core;

import org.marketcetera.photon.commons.ReflectiveMessages;
import org.marketcetera.util.log.I18NMessage0P;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * The internationalization constants used by this package.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: Messages.java 16604 2013-06-26 14:49:42Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: Messages.java 16604 2013-06-26 14:49:42Z colin $")
final class Messages {
    
    static I18NMessage0P LOGOUT_SERVICE_UNHANDLED_EXCEPTION;

    static {
        ReflectiveMessages.init(Messages.class);
    }

    private Messages() {
        throw new AssertionError("non-instantiable"); //$NON-NLS-1$
    }
}
