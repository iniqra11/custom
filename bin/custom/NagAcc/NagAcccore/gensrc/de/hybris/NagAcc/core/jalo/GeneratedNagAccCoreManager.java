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
import de.hybris.NagAcc.core.jalo.ApparelProduct;
import de.hybris.NagAcc.core.jalo.ApparelSizeVariantProduct;
import de.hybris.NagAcc.core.jalo.ApparelStyleVariantProduct;
import de.hybris.NagAcc.core.jalo.Designer;
import de.hybris.NagAcc.core.jalo.DesignerBannerComponent;
import de.hybris.NagAcc.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.Cart;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>NagAccCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNagAccCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("designer", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("designerPreference", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("designer", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Order", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("hasSameDesigner", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Cart", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Designer createDesigner(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.DESIGNER );
			return (Designer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Designer : "+e.getMessage(), 0 );
		}
	}
	
	public Designer createDesigner(final Map attributeValues)
	{
		return createDesigner( getSession().getSessionContext(), attributeValues );
	}
	
	public DesignerBannerComponent createDesignerBannerComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.DESIGNERBANNERCOMPONENT );
			return (DesignerBannerComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DesignerBannerComponent : "+e.getMessage(), 0 );
		}
	}
	
	public DesignerBannerComponent createDesignerBannerComponent(final Map attributeValues)
	{
		return createDesignerBannerComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.designer</code> attribute.
	 * @return the designer - Designer associated with the Product
	 */
	public Designer getDesigner(final SessionContext ctx, final Product item)
	{
		return (Designer)item.getProperty( ctx, NagAccCoreConstants.Attributes.Product.DESIGNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.designer</code> attribute.
	 * @return the designer - Designer associated with the Product
	 */
	public Designer getDesigner(final Product item)
	{
		return getDesigner( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.designer</code> attribute. 
	 * @param value the designer - Designer associated with the Product
	 */
	public void setDesigner(final SessionContext ctx, final Product item, final Designer value)
	{
		item.setProperty(ctx, NagAccCoreConstants.Attributes.Product.DESIGNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.designer</code> attribute. 
	 * @param value the designer - Designer associated with the Product
	 */
	public void setDesigner(final Product item, final Designer value)
	{
		setDesigner( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.designer</code> attribute.
	 * @return the designer - Designer of the all the products in the Order
	 */
	public Designer getDesigner(final SessionContext ctx, final Order item)
	{
		return (Designer)item.getProperty( ctx, NagAccCoreConstants.Attributes.Order.DESIGNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.designer</code> attribute.
	 * @return the designer - Designer of the all the products in the Order
	 */
	public Designer getDesigner(final Order item)
	{
		return getDesigner( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.designer</code> attribute. 
	 * @param value the designer - Designer of the all the products in the Order
	 */
	public void setDesigner(final SessionContext ctx, final Order item, final Designer value)
	{
		item.setProperty(ctx, NagAccCoreConstants.Attributes.Order.DESIGNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.designer</code> attribute. 
	 * @param value the designer - Designer of the all the products in the Order
	 */
	public void setDesigner(final Order item, final Designer value)
	{
		setDesigner( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.designerPreference</code> attribute.
	 * @return the designerPreference - Preferred Designer of the Customer
	 */
	public Designer getDesignerPreference(final SessionContext ctx, final Customer item)
	{
		return (Designer)item.getProperty( ctx, NagAccCoreConstants.Attributes.Customer.DESIGNERPREFERENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.designerPreference</code> attribute.
	 * @return the designerPreference - Preferred Designer of the Customer
	 */
	public Designer getDesignerPreference(final Customer item)
	{
		return getDesignerPreference( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.designerPreference</code> attribute. 
	 * @param value the designerPreference - Preferred Designer of the Customer
	 */
	public void setDesignerPreference(final SessionContext ctx, final Customer item, final Designer value)
	{
		item.setProperty(ctx, NagAccCoreConstants.Attributes.Customer.DESIGNERPREFERENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.designerPreference</code> attribute. 
	 * @param value the designerPreference - Preferred Designer of the Customer
	 */
	public void setDesignerPreference(final Customer item, final Designer value)
	{
		setDesignerPreference( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return NagAccCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.hasSameDesigner</code> attribute.
	 * @return the hasSameDesigner - Flag to indicate whether all products in the cart have the same designer
	 */
	public Boolean isHasSameDesigner(final SessionContext ctx, final Cart item)
	{
		return (Boolean)item.getProperty( ctx, NagAccCoreConstants.Attributes.Cart.HASSAMEDESIGNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.hasSameDesigner</code> attribute.
	 * @return the hasSameDesigner - Flag to indicate whether all products in the cart have the same designer
	 */
	public Boolean isHasSameDesigner(final Cart item)
	{
		return isHasSameDesigner( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.hasSameDesigner</code> attribute. 
	 * @return the hasSameDesigner - Flag to indicate whether all products in the cart have the same designer
	 */
	public boolean isHasSameDesignerAsPrimitive(final SessionContext ctx, final Cart item)
	{
		Boolean value = isHasSameDesigner( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cart.hasSameDesigner</code> attribute. 
	 * @return the hasSameDesigner - Flag to indicate whether all products in the cart have the same designer
	 */
	public boolean isHasSameDesignerAsPrimitive(final Cart item)
	{
		return isHasSameDesignerAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cart.hasSameDesigner</code> attribute. 
	 * @param value the hasSameDesigner - Flag to indicate whether all products in the cart have the same designer
	 */
	public void setHasSameDesigner(final SessionContext ctx, final Cart item, final Boolean value)
	{
		item.setProperty(ctx, NagAccCoreConstants.Attributes.Cart.HASSAMEDESIGNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cart.hasSameDesigner</code> attribute. 
	 * @param value the hasSameDesigner - Flag to indicate whether all products in the cart have the same designer
	 */
	public void setHasSameDesigner(final Cart item, final Boolean value)
	{
		setHasSameDesigner( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cart.hasSameDesigner</code> attribute. 
	 * @param value the hasSameDesigner - Flag to indicate whether all products in the cart have the same designer
	 */
	public void setHasSameDesigner(final SessionContext ctx, final Cart item, final boolean value)
	{
		setHasSameDesigner( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cart.hasSameDesigner</code> attribute. 
	 * @param value the hasSameDesigner - Flag to indicate whether all products in the cart have the same designer
	 */
	public void setHasSameDesigner(final Cart item, final boolean value)
	{
		setHasSameDesigner( getSession().getSessionContext(), item, value );
	}
	
}
