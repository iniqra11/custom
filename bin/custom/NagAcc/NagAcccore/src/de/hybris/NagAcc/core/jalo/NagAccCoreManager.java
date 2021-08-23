/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.NagAcc.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.NagAcc.core.constants.NagAccCoreConstants;
import de.hybris.NagAcc.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class NagAccCoreManager extends GeneratedNagAccCoreManager
{
	public static final NagAccCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (NagAccCoreManager) em.getExtension(NagAccCoreConstants.EXTENSIONNAME);
	}
}
