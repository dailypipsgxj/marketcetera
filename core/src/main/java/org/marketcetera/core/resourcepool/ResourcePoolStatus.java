package org.marketcetera.core.resourcepool;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Indicates the status of a {@link ResourcePool}.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: ResourcePoolStatus.java 16901 2014-05-11 16:14:11Z colin $
 * @since 2.4.0
 */
@ClassVersion("$Id: ResourcePoolStatus.java 16901 2014-05-11 16:14:11Z colin $")
public enum ResourcePoolStatus
{
    /**
     * the resource pool is ready for use
     */
    READY,
    /**
     * the resource pool is on the way to READY
     */
    STARTING,
    /**
     * the resource pool is on the way to NOT_READY
     */
    STOPPING,
    /**
     * the resource pool cannot be used
     */
    NOT_READY;
}
