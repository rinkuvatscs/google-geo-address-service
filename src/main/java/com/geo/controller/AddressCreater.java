package com.geo.controller;

import org.springframework.stereotype.Component;

import com.geo.constants.Constants;

@Component
public class AddressCreater {

	public static final String AND_KEY = "&key=";

	public String getFullAddress(String address) {
		return Constants.GOOGLE_GEO_SERVICE_URL + address + AND_KEY
				+ Constants.GOGGLE_GEO_SERVICE_KEY_FOR_RINKU_VATS;
	}
}
