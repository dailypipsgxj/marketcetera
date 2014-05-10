package org.marketcetera.strategy;

import org.marketcetera.core.ClassVersion;

/* $License$ */

/**
 * {@link Executor} implementation for Java strategies.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: JavaExecutor.java 16667 2013-08-27 19:28:48Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: JavaExecutor.java 16667 2013-08-27 19:28:48Z colin $")
class JavaExecutor
    extends AbstractExecutor
{
    /**
     * Create a new JavaExecutor instance.
     *
     * @param inStrategy a <code>Strategy</code> value
     */
    JavaExecutor(Strategy inStrategy)
    {
        super(inStrategy);
    }
    /* (non-Javadoc)
     * @see org.marketcetera.strategy.AbstractExecutor#preprocess(java.lang.String)
     */
    @Override
    protected String preprocess(String inScript)
            throws StrategyException
    {
        return inScript;
    }
    /* (non-Javadoc)
     * @see org.marketcetera.strategy.AbstractExecutor#getExecutionEngine()
     */
    @Override
    protected ExecutionEngine getExecutionEngine()
            throws StrategyException
    {
        // need to decide whether to use JavaCompilerExecutionEngine or JavaClasspathExecutionEngine
        if(getStrategy().getScript() == null) {
            return new JavaClasspathExecutionEngine();
        } else {
            return new JavaCompilerExecutionEngine();
        }
    }
    /* (non-Javadoc)
     * @see org.marketcetera.strategy.Executor#interpretRuntimeException(java.lang.Exception)
     */
    @Override
    public String interpretRuntimeException(Exception inE)
    {
        return inE.toString();
    }
    /* (non-Javadoc)
     * @see org.marketcetera.strategy.Executor#translateMethodName(java.lang.String)
     */
    @Override
    public String translateMethodName(String inMethodName)
    {
        return inMethodName;
    }
}
