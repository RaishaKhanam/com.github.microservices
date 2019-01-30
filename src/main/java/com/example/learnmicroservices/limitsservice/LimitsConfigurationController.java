
package com.example.learnmicroservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveFromConfiguration() {
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
	
}
