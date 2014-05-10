package org.marketcetera.quickfix.customfields;

import org.marketcetera.core.ClassVersion;
import quickfix.UtcTimeStampField;

import java.util.Date;

/**
 * Implementation of a custom field 9883: DateFrom
 * @author toli
 * @version $Id: DateFrom.java 16841 2014-02-20 19:59:04Z colin $
 */

@ClassVersion("$Id: DateFrom.java 16841 2014-02-20 19:59:04Z colin $")
public class DateFrom extends UtcTimeStampField {
    public static final int FIELD = 9883;
    public DateFrom() {
        super(FIELD, new Date()); //non-i18n
    }

    public DateFrom(Date date) {
        super(FIELD, date);
    }
    private static final long serialVersionUID = -2169346763561325201L;
}
