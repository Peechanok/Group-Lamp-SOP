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
import com.microservices.servicediscovery.bean.Course;

@RestController
public class CourseService {
	private String jsonString = "{'06016309':'it law','06016308':'mobile dev','06016307':'icn'}";
	private JsonObject jsonObject = (JsonObject) JsonParser.parseString(jsonString);
	private String json_teacher = "{'06016309' :'Sumet Prabhavat','06016308':'Supannada Chotiphan','06016307':'Lapas Pradittasnee'}";
	private JsonObject jsonOteacer_ob = (JsonObject) JsonParser.parseString(json_teacher);
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(
			@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}
	
	@RequestMapping("/v1/course/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		Course c = new Course();
		c.setId(courseId);
		c.setName(jsonObject.get(courseId).getAsString());
		c.setName_teacher(jsonOteacer_ob.get(courseId).getAsString());
		return c;
	}
}
