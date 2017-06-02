package com.bakerbeach.market.translation.api.service;

import java.util.List;
import java.util.Locale;

import com.bakerbeach.market.translation.api.model.I18NMessage;
import com.bakerbeach.market.translation.service.TranslationServiceException;

public interface TranslationService {

	String getMessage(String tag, String type, String code, Object[] args, String defaultMessage, Locale locale);

	String getMessage(String tag, String code, Object[] args, String defaultMessage, Locale locale);

	I18NMessage getReverseUrlTranslation(List<String> tag, String text, Locale locale)
			throws TranslationServiceException;

	I18NMessage loadReverseTranslation(List<String> tags, String type, String text, Locale locale)
			throws TranslationServiceException;

	void clearCache();

	void clearCache(String tag, String type, String code);

	void save(I18NMessage message);

	I18NMessage loadMessage(String tag, String type, String code);

}