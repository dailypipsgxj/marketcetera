package org.marketcetera.trade;

import org.marketcetera.util.misc.ClassVersion;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

/* $License$ */
/**
 * Indicates whether the resulting position after a trade should be an
 * opening position or closing position.
 * Used for omnibus accounting - where accounts are held on a
 * gross basis instead of being netted together.
 *
 * (formerly named: OpenClose prior to FIX 4.3)
 *
 * @author anshul@marketcetera.com
 * @version $Id: PositionEffect.java 16339 2012-10-31 15:59:24Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: PositionEffect.java 16339 2012-10-31 15:59:24Z colin $") //$NON-NLS-1$
public enum PositionEffect {
    /**
     * Sentinel value for PositionEffect that the system is not currently
     * aware of.
     */
    Unknown(Character.MIN_VALUE),
    Open(quickfix.field.PositionEffect.OPEN),
    Close(quickfix.field.PositionEffect.CLOSE)
    ;

    /**
     * Creates an instance.
     *
     * @param inFIXValue the FIX char value for this instance.
     */
    private PositionEffect(char inFIXValue) {
        mFIXValue = inFIXValue;
    }
    /**
     * Gets the PositionEffect instance.
     *
     * @param inValue the FIX char value.
     *
     * @return the PositionEffect instance.
     */
    public static PositionEffect getInstanceForFIXValue(char inValue) {
        PositionEffect s = mFIXValueMap.get(inValue);
        return s == null
                ? Unknown
                : s;
    }

    /**
     * The FIX char value for this instance.
     *
     * @return the FIX char value for this instance.
     */
    public char getFIXValue() {
        return mFIXValue;
    }

    private final char mFIXValue;
    private static final Map<Character, PositionEffect> mFIXValueMap;
    static {
        Map<Character, PositionEffect> table = new HashMap<Character, PositionEffect>();
        for(PositionEffect s: PositionEffect.values()) {
            table.put(s.getFIXValue(),s);
        }
        mFIXValueMap = Collections.unmodifiableMap(table);
    }
}