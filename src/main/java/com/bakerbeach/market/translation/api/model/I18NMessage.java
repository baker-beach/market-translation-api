package com.bakerbeach.market.translation.api.model;

import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public interface I18NMessage {

	String getKey();

	Set<String> getAviableLocales();

	String getText(String locale);

	String getText(Locale locale);

	Date getLastUpdate();

	void setLastUpdate(Date lastUpdate);

	String getTag();

	String getType();

	Map<String, String> getMessages();
	
}
