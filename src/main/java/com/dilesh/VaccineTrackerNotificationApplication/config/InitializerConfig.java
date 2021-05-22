package com.dilesh.VaccineTrackerNotificationApplication.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.dilesh.VaccineTrackerNotificationApplication.service.VaccineTrackerImpl;

@Configuration
public class InitializerConfig implements ApplicationListener<ApplicationReadyEvent>{

	@Autowired
	private VaccineTrackerImpl vaccineTrackerImpl;
	
	@Bean
	  public static PropertySourcesPlaceholderConfigurer createPropertyConfigurer()
	  {
	    PropertySourcesPlaceholderConfigurer propertyConfigurer = new PropertySourcesPlaceholderConfigurer();
	    propertyConfigurer.setTrimValues(true);
	    return propertyConfigurer;
	  }

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		try {
			vaccineTrackerImpl.trackerOrchestrator();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
