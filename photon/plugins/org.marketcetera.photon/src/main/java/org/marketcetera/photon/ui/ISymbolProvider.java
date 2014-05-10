package org.marketcetera.photon.ui;

import org.marketcetera.trade.Instrument;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Interface for objects that provide an {@link Instrument} symbol.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ISymbolProvider.java 16604 2013-06-26 14:49:42Z colin $
 * @since 1.0.0
 */
@ClassVersion("$Id: ISymbolProvider.java 16604 2013-06-26 14:49:42Z colin $")//$NON-NLS-1$
public interface ISymbolProvider {

	/**
	 * @return an equity, should not be null
	 */
	Instrument getInstrument();
	
}
