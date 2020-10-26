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
import com.microservices.servicediscovery.bean.Grading;

@RestController
public class GradingService {
	private String jsonString = "{'61070003':'it law','61070004':'mobile dev','61070006':'icn'}";
	private JsonObject jsonObject = (JsonObject) JsonParser.parseString(jsonString);
	private String jsonGpa = "{'61070003':'2.04','61070004':'4.00','61070006':'3.10'}";
	private JsonObject jsonObject_gpa = (JsonObject) JsonParser.parseString(jsonGpa);
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(
			@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}
	
	@RequestMapping("/v1/grading/{gradingId}")
	public Grading getGrading(@PathVariable String gradingId) {
		Grading s = new Grading();
		s.setId(gradingId);
		s.setName(jsonObject.get(gradingId).getAsString());
		s.setGpa(jsonObject_gpa.get(gradingId).getAsString());
		return s;
	}
}
