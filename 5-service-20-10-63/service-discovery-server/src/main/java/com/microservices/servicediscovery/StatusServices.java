package com.microservices.servicediscovery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.shared.Applications;
import com.netflix.eureka.EurekaServerContextHolder;
import com.netflix.eureka.registry.PeerAwareInstanceRegistry;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

@RestController
public class StatusServices {
	private Set<String> services = new HashSet<String>();
	
	@RequestMapping(value = "/api",method=RequestMethod.GET)
    public String Test() {
    	return "hello World";
    }
	
	@RequestMapping(value = "/all",method=RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> getAll() {
		PeerAwareInstanceRegistry registry = EurekaServerContextHolder.getInstance().getServerContext().getRegistry();
	    Applications applications = registry.getApplications();
	    
	    Set<String> current = new HashSet<String>();
	    
	    applications.getRegisteredApplications().forEach((registeredApplication) -> {
	        registeredApplication.getInstances().forEach((instance) -> {
	            System.out.println(instance.getAppName() + " (" + instance.getInstanceId() + ") : ");
	        	current.add("\""+instance.getAppName()+"\"");
	        });
	    });
	    
	    services.removeAll(current);
	    String json = "{\"up\":["+ String.join(", ", current) +"],\"down\":["+ String.join(", ", services) +"]}";
	    current.forEach(data -> services.add(data)); 
	    return new ResponseEntity<String>(json, HttpStatus.OK);
	}
}



