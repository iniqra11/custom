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
import de.hybris.platform.jalo.GenericItem;
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Designer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDesigner extends GenericItem
{
	/** Qualifier of the <code>Designer.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>Designer.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Designer.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Designer.numberOfOrders</code> attribute **/
	public static final String NUMBEROFORDERS = "numberOfOrders";
	/** Qualifier of the <code>Designer.photo</code> attribute **/
	public static final String PHOTO = "photo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(NUMBEROFORDERS, AttributeMode.INITIAL);
		tmp.put(PHOTO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.description</code> attribute.
	 * @return the description - Description of the Designer
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDesigner.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.description</code> attribute.
	 * @return the description - Description of the Designer
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.description</code> attribute. 
	 * @return the localized description - Description of the Designer
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.description</code> attribute. 
	 * @return the localized description - Description of the Designer
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.description</code> attribute. 
	 * @param value the description - Description of the Designer
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDesigner.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.description</code> attribute. 
	 * @param value the description - Description of the Designer
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.description</code> attribute. 
	 * @param value the description - Description of the Designer
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.description</code> attribute. 
	 * @param value the description - Description of the Designer
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.name</code> attribute.
	 * @return the name - Name of the Designer
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDesigner.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.name</code> attribute.
	 * @return the name - Name of the Designer
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.name</code> attribute. 
	 * @return the localized name - Name of the Designer
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.name</code> attribute. 
	 * @return the localized name - Name of the Designer
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.name</code> attribute. 
	 * @param value the name - Name of the Designer
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDesigner.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.name</code> attribute. 
	 * @param value the name - Name of the Designer
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.name</code> attribute. 
	 * @param value the name - Name of the Designer
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.name</code> attribute. 
	 * @param value the name - Name of the Designer
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.numberOfOrders</code> attribute.
	 * @return the numberOfOrders - Number of Orders received by the Designer
	 */
	public Integer getNumberOfOrders(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFORDERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.numberOfOrders</code> attribute.
	 * @return the numberOfOrders - Number of Orders received by the Designer
	 */
	public Integer getNumberOfOrders()
	{
		return getNumberOfOrders( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.numberOfOrders</code> attribute. 
	 * @return the numberOfOrders - Number of Orders received by the Designer
	 */
	public int getNumberOfOrdersAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfOrders( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.numberOfOrders</code> attribute. 
	 * @return the numberOfOrders - Number of Orders received by the Designer
	 */
	public int getNumberOfOrdersAsPrimitive()
	{
		return getNumberOfOrdersAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.numberOfOrders</code> attribute. 
	 * @param value the numberOfOrders - Number of Orders received by the Designer
	 */
	public void setNumberOfOrders(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFORDERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.numberOfOrders</code> attribute. 
	 * @param value the numberOfOrders - Number of Orders received by the Designer
	 */
	public void setNumberOfOrders(final Integer value)
	{
		setNumberOfOrders( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.numberOfOrders</code> attribute. 
	 * @param value the numberOfOrders - Number of Orders received by the Designer
	 */
	public void setNumberOfOrders(final SessionContext ctx, final int value)
	{
		setNumberOfOrders( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.numberOfOrders</code> attribute. 
	 * @param value the numberOfOrders - Number of Orders received by the Designer
	 */
	public void setNumberOfOrders(final int value)
	{
		setNumberOfOrders( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.photo</code> attribute.
	 * @return the photo - Photo of the Designer
	 */
	public Media getPhoto(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, PHOTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.photo</code> attribute.
	 * @return the photo - Photo of the Designer
	 */
	public Media getPhoto()
	{
		return getPhoto( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.photo</code> attribute. 
	 * @param value the photo - Photo of the Designer
	 */
	public void setPhoto(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, PHOTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.photo</code> attribute. 
	 * @param value the photo - Photo of the Designer
	 */
	public void setPhoto(final Media value)
	{
		setPhoto( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.uid</code> attribute.
	 * @return the uid - Unique Id of the Designer
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designer.uid</code> attribute.
	 * @return the uid - Unique Id of the Designer
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.uid</code> attribute. 
	 * @param value the uid - Unique Id of the Designer
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designer.uid</code> attribute. 
	 * @param value the uid - Unique Id of the Designer
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
}
