package com.bakerbeach.market.translation.service;

import com.bakerbeach.market.translation.api.service.TranslationService;

public class TranslationServiceHolder {

	private static TranslationService translationService;

	public static TranslationService getTranslationService() {
		return translationService;
	}

	public static void setTranslationService(TranslationService translationService) {
		TranslationServiceHolder.translationService = translationService;
	}

}
