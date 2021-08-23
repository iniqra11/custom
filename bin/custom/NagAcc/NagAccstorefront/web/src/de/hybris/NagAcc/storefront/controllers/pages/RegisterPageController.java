/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.NagAcc.storefront.controllers.pages;

import de.hybris.NagAcc.facades.designer.DesignerFacade;
import de.hybris.NagAcc.facades.designer.data.DesignerData;
import de.hybris.NagAcc.storefront.forms.CustomRegisterForm;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.Breadcrumb;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractRegisterPageController;
import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.NagAcc.storefront.controllers.ControllerConstants;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;


/**
 * Register Controller for mobile. Handles login and register for the account flow.
 */
@Controller
@RequestMapping(value = "/register")
public class RegisterPageController extends AbstractRegisterPageController
{
	private HttpSessionRequestCache httpSessionRequestCache;
	private final static Logger LOG = Logger.getLogger(RegisterPageController.class.getName());



	@Override
	protected AbstractPageModel getCmsPage() throws CMSItemNotFoundException
	{
		return getContentPageForLabelOrId("register");
	}

	@Override
	protected String getSuccessRedirect(final HttpServletRequest request, final HttpServletResponse response)
	{
		if (httpSessionRequestCache.getRequest(request, response) != null)
		{
			return httpSessionRequestCache.getRequest(request, response).getRedirectUrl();
		}
		return "/";
	}

	@Override
	protected String getView()
	{
		return ControllerConstants.Views.Pages.Account.AccountRegisterPage;
	}

	@Resource(name = "httpSessionRequestCache")
	public void setHttpSessionRequestCache(final HttpSessionRequestCache accHttpSessionRequestCache)
	{
		this.httpSessionRequestCache = accHttpSessionRequestCache;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String doRegister(final Model model) throws CMSItemNotFoundException
	{
		return getDefaultRegistrationPage(model); // changed
		//return getCustomRegistrationPage(model);
	}



	@RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
	public String doRegister(final RegisterForm form, final BindingResult bindingResult, final Model model,
			final HttpServletRequest request, final HttpServletResponse response, final RedirectAttributes redirectModel)
			throws CMSItemNotFoundException
	{
		getRegistrationValidator().validate(form, bindingResult);
		return processRegisterUserRequest(null, form, bindingResult, model, request, response, redirectModel);
	}

	// New methods added for exit test
	/*@Override this was copied from base class only last 3rd line was added
	protected String getDefaultRegistrationPage(Model model) throws CMSItemNotFoundException {
		storeCmsPageInModel(model, getCmsPage());
		setUpMetaDataForContentPage(model, (ContentPageModel) getCmsPage());
		final Breadcrumb loginBreadcrumbEntry = new Breadcrumb("#",
				getMessageSource().getMessage("header.link.login", null, getI18nService().getCurrentLocale()), null);
		model.addAttribute("breadcrumbs", Collections.singletonList(loginBreadcrumbEntry));
		model.addAttribute("customRegisterForm", new CustomRegisterForm()); // modelAttribute in form in register.tag
		LOG.info("I AM HEREE!!");
		return getView();
	}

	private String getCustomRegistrationPage(Model model) throws CMSItemNotFoundException{
		storeCmsPageInModel(model, getCmsPage());
		setUpMetaDataForContentPage(model, (ContentPageModel) getCmsPage());
		final Breadcrumb loginBreadcrumbEntry = new Breadcrumb("#",
				getMessageSource().getMessage("header.link.login", null, getI18nService().getCurrentLocale()), null);
		model.addAttribute("breadcrumbs", Collections.singletonList(loginBreadcrumbEntry));
		model.addAttribute("customRegisterForm", new CustomRegisterForm()); // modelAttribute in form in register.tag
		LOG.info("I AM HEREE!!");
		return getView();
	}*/



}
