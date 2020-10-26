package com.microservices.servicediscovery.controller;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.microservices.servicediscovery.bean.Account;

@RestController
public class AccountService {
	private String jsonString = "{'61070003':'นายกฤตนัย  พหนการ','61070004':'นางสาวกฤติมา  จันทะชาลี','61070006':'นายกฤษฎาภา  ง่วนจร'}";
	private JsonObject jsonObject = (JsonObject) JsonParser.parseString(jsonString);
	private String jsonStrpass = "{'61070003':'12232wwe','61070004':'32432425de','61070006':'defdfe222'}";
	private JsonObject jsonObjectpass = (JsonObject) JsonParser.parseString(jsonStrpass);
	private String jsonStruser = "{'61070003':'aaaaaaa','61070004':'bbbbbbb','61070006':'ccccccc'}";
	private JsonObject jsonObjectuser = (JsonObject) JsonParser.parseString(jsonStruser);
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(
			@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}
	
	@RequestMapping("/v1/account/{accountId}")
	public Account getAccount(@PathVariable String accountId) {
		Account s = new Account();
		s.setId(accountId);
		s.setName(jsonObject.get(accountId).getAsString());
		s.setUsername(jsonObjectuser.get(accountId).getAsString());
		s.setPassword(jsonObjectpass.get(accountId).getAsString());
		return s;
	}
}
