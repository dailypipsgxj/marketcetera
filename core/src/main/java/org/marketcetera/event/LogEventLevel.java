package org.marketcetera.event;

import org.marketcetera.util.log.SLF4JLoggerProxy;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Severity level of {@link LogEvent}.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: LogEventLevel.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
@ClassVersion("$Id: LogEventLevel.java 16154 2012-07-14 16:34:05Z colin $")
public enum LogEventLevel
{
    DEBUG,
    INFO,
    WARN,
    ERROR;
    /**
     * Determines if the given event should be logged or not.
     * 
     * @param inEvent a <code>LogEvent</code> value
     * @param inCategory a <code>String</code> value containing the log category
     * @return a <code>boolean</code> value
     */
    public static boolean shouldLog(LogEvent inEvent,
                                    String inCategory)
    {
        if(inEvent == null) {
            return false;
        }
        if(DEBUG.equals(inEvent.getLevel())) {
            return SLF4JLoggerProxy.isDebugEnabled(inCategory);
        }
        if(INFO.equals(inEvent.getLevel())) {
            return SLF4JLoggerProxy.isInfoEnabled(inCategory);
        }
        if(WARN.equals(inEvent.getLevel())) {
            return SLF4JLoggerProxy.isWarnEnabled(inCategory);
        }
        if(ERROR.equals(inEvent.getLevel())) {
            return SLF4JLoggerProxy.isErrorEnabled(inCategory);
        }
        return false;
    }
}
