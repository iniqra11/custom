/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 23-Aug-2021, 6:06:47 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.NagAcc.core.jalo;

import de.hybris.NagAcc.core.constants.NagAccCoreConstants;
import de.hybris.platform.cms2lib.components.BannerComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cms2lib.components.BannerComponent DesignerBannerComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDesignerBannerComponent extends BannerComponent
{
	/** Qualifier of the <code>DesignerBannerComponent.designerName</code> attribute **/
	public static final String DESIGNERNAME = "designerName";
	/** Qualifier of the <code>DesignerBannerComponent.designerPhoto</code> attribute **/
	public static final String DESIGNERPHOTO = "designerPhoto";
	/** Qualifier of the <code>DesignerBannerComponent.designerDescription</code> attribute **/
	public static final String DESIGNERDESCRIPTION = "designerDescription";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BannerComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DESIGNERNAME, AttributeMode.INITIAL);
		tmp.put(DESIGNERPHOTO, AttributeMode.INITIAL);
		tmp.put(DESIGNERDESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DesignerBannerComponent.designerDescription</code> attribute.
	 * @return the designerDescription - Description of the Designer
	 */
	public String getDesignerDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDesignerBannerComponent.getDesignerDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESIGNERDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DesignerBannerComponent.designerDescription</code> attribute.
	 * @return the designerDescription - Description of the Designer
	 */
	public String getDesignerDescription()
	{
		return getDesignerDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DesignerBannerComponent.designerDescription</code> attribute. 
	 * @return the localized designerDescription - Description of the Designer
	 */
	public Map<Language,String> getAllDesignerDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESIGNERDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DesignerBannerComponent.designerDescription</code> attribute. 
	 * @return the localized designerDescription - Description of the Designer
	 */
	public Map<Language,String> getAllDesignerDescription()
	{
		return getAllDesignerDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DesignerBannerComponent.designerDescription</code> attribute. 
	 * @param value the designerDescription - Description of the Designer
	 */
	public void setDesignerDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDesignerBannerComponent.setDesignerDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESIGNERDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DesignerBannerComponent.designerDescription</code> attribute. 
	 * @param value the designerDescription - Description of the Designer
	 */
	public void setDesignerDescription(final String value)
	{
		setDesignerDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DesignerBannerComponent.designerDescription</code> attribute. 
	 * @param value the designerDescription - Description of the Designer
	 */
	public void setAllDesignerDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESIGNERDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DesignerBannerComponent.designerDescription</code> attribute. 
	 * @param value the designerDescription - Description of the Designer
	 */
	public void setAllDesignerDescription(final Map<Language,String> value)
	{
		setAllDesignerDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DesignerBannerComponent.designerName</code> attribute.
	 * @return the designerName - Name of the Designer
	 */
	public String getDesignerName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDesignerBannerComponent.getDesignerName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESIGNERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DesignerBannerComponent.designerName</code> attribute.
	 * @return the designerName - Name of the Designer
	 */
	public String getDesignerName()
	{
		return getDesignerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DesignerBannerComponent.designerName</code> attribute. 
	 * @return the localized designerName - Name of the Designer
	 */
	public Map<Language,String> getAllDesignerName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESIGNERNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DesignerBannerComponent.designerName</code> attribute. 
	 * @return the localized designerName - Name of the Designer
	 */
	public Map<Language,String> getAllDesignerName()
	{
		return getAllDesignerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DesignerBannerComponent.designerName</code> attribute. 
	 * @param value the designerName - Name of the Designer
	 */
	public void setDesignerName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDesignerBannerComponent.setDesignerName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESIGNERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DesignerBannerComponent.designerName</code> attribute. 
	 * @param value the designerName - Name of the Designer
	 */
	public void setDesignerName(final String value)
	{
		setDesignerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DesignerBannerComponent.designerName</code> attribute. 
	 * @param value the designerName - Name of the Designer
	 */
	public void setAllDesignerName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESIGNERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DesignerBannerComponent.designerName</code> attribute. 
	 * @param value the designerName - Name of the Designer
	 */
	public void setAllDesignerName(final Map<Language,String> value)
	{
		setAllDesignerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DesignerBannerComponent.designerPhoto</code> attribute.
	 * @return the designerPhoto - Picture of the Designer
	 */
	public Media getDesignerPhoto(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, DESIGNERPHOTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DesignerBannerComponent.designerPhoto</code> attribute.
	 * @return the designerPhoto - Picture of the Designer
	 */
	public Media getDesignerPhoto()
	{
		return getDesignerPhoto( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DesignerBannerComponent.designerPhoto</code> attribute. 
	 * @param value the designerPhoto - Picture of the Designer
	 */
	public void setDesignerPhoto(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, DESIGNERPHOTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DesignerBannerComponent.designerPhoto</code> attribute. 
	 * @param value the designerPhoto - Picture of the Designer
	 */
	public void setDesignerPhoto(final Media value)
	{
		setDesignerPhoto( getSession().getSessionContext(), value );
	}
	
}
