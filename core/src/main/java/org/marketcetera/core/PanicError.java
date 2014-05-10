package org.marketcetera.core;

/**
 * Our top-level error that is thrown when things really break
 * @author Toli Kuznets
 * @version $Id: PanicError.java 16841 2014-02-20 19:59:04Z colin $
 */
@ClassVersion("$Id: PanicError.java 16841 2014-02-20 19:59:04Z colin $")
public class PanicError extends Error
{
    public PanicError(String message)
    {
        super(message);
    }

    public PanicError(Throwable cause)
    {
        super(cause);
    }

    public PanicError(String message, Throwable cause)
    {
        super(message, cause);
    }
    private static final long serialVersionUID = -403949921663251427L;
}
