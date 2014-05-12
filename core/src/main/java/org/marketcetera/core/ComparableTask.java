package org.marketcetera.core;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Provides an orderable, executable task.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: ComparableTask.java 16901 2014-05-11 16:14:11Z colin $
 * @since 2.4.0
 */
@ClassVersion("$Id: ComparableTask.java 16901 2014-05-11 16:14:11Z colin $")
public interface ComparableTask
        extends Runnable, Comparable<ComparableTask>
{
}
