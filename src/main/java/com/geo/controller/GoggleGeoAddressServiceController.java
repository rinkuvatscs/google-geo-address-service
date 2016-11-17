package com.geo.controller;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.geo.code.Result;
import com.geo.pojo.GeoCodeResponse;
import com.geo.rest.RestServiceCaller;

@RestController 
@RequestMapping("/geo-code-service")
@Api(basePath = "/geo-code-service", value = "geo-code-service", description = "Operations with Landlords", produces = "application/json")
public class GoggleGeoAddressServiceController {


	@Autowired
	RestServiceCaller restServiceCaller ;
	
	@Autowired
	AddressCreater addressCreater ;

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/geocode/{address}")
	@ResponseBody
	public GeoCodeResponse getGeoCode(@PathVariable String address) {
		Result result = restServiceCaller.getRestTemplate().getForObject(addressCreater.getFullAddress(address), Result.class) ;
		System.out.println(result);
		System.out.println(result.getFormattedAddress());
		System.out.println(result.getGeometry());
		GeoCodeResponse geoCodeResponse = new GeoCodeResponse() ;
		
		return geoCodeResponse ;
	}

	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Doctor Management Tool";
	}

}
