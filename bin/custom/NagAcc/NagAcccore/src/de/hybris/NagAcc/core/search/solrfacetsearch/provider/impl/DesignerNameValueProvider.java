package de.hybris.NagAcc.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class DesignerNameValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider {

    private FieldNameProvider fieldNameProvider;

    public CommonI18NService getCommonI18NService() {
        return commonI18NService;
    }

    public void setCommonI18NService(CommonI18NService commonI18NService) {
        this.commonI18NService = commonI18NService;
    }

    private CommonI18NService commonI18NService;

    public FieldNameProvider getFieldNameProvider() {
        return fieldNameProvider;
    }

    public void setFieldNameProvider(FieldNameProvider fieldNameProvider) {
        this.fieldNameProvider = fieldNameProvider;
    }

    @Override
    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object o) throws FieldValueProviderException {
        if (o instanceof ProductModel)
        {
            final ProductModel product = (ProductModel) o;
            final Collection<FieldValue> fieldValues = new ArrayList<FieldValue>();
            // case of the indexed property is localized
            if (indexedProperty.isLocalized())
            {
                // retrieve and iterate over all the configured languages
                final Collection<LanguageModel> languages = indexConfig.getLanguages();
                for (final LanguageModel language : languages)
                {
                    fieldValues.addAll(createFieldValue(product, language, indexedProperty));
                }
            }
            // case of the indexed property is not localized
            else
            {
                fieldValues.addAll(createFieldValue(product, null, indexedProperty));
            }
            return fieldValues;

        }
        else
        {
            throw new FieldValueProviderException("Cannot fetch designer name");
        }
    }

    private List<FieldValue> createFieldValue(ProductModel product, LanguageModel language, IndexedProperty indexedProperty) {

        final List<FieldValue> fieldValues = new ArrayList<FieldValue>();
        Locale locale = null;
        final String designerName;
        if (product.getDesigner() != null) {
        if (language != null)
        {
            locale = commonI18NService.getLocaleForLanguage(language);
        }
        // get  names by language
        i18nService.setLocalizationFallbackEnabled(false);
        if (locale == null)
           designerName = product.getDesigner().getName();
        else
            designerName = product.getDesigner().getName(locale);

        i18nService.setLocalizationFallbackEnabled(true);
        addFieldValues(fieldValues, indexedProperty, language, designerName);
        }
        return fieldValues;
    }

    private void addFieldValues(List<FieldValue> fieldValues, IndexedProperty indexedProperty, LanguageModel language, String designerName) {
        // generate all Solr fields based on different qualifiers
        final Collection<String> fieldNames = fieldNameProvider.getFieldNames(indexedProperty, language == null ? null : language.getIsocode());
        for (final String fieldName : fieldNames)
        {
            fieldValues.add(new FieldValue(fieldName, designerName));
        }
    }


}
