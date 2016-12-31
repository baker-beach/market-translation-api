package com.bakerbeach.market.translation.api.model;

import java.util.Date;
import java.util.Locale;
import java.util.Set;

public interface I18NMessage {

	String getKey();

	Set<String> getAviableLocales();

	String getText(String locale);

	String getText(Locale locale);

	Date getLastUpdate();

	String getTag();

	String getType();

}
