package org.marketcetera.core;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Provides validation services.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: Validator.java 16901 2014-05-11 16:14:11Z colin $
 * @since 2.4.0
 */
@ClassVersion("$Id: Validator.java 16901 2014-05-11 16:14:11Z colin $")
public interface Validator<Clazz>
{
    /**
     * Validates the given data.
     *
     * @param inData a <code>Clazz</code> value
     * @throws CoreException if a validation exception occurs
     */
    public void validate(Clazz inData);
}
