package com.dilesh.VaccineTrackerNotificationApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * @author Dilesh Solanki
 * 
*/
@SpringBootApplication
@ComponentScan("com.dilesh.VaccineTrackerNotificationApplication")
@EnableAutoConfiguration
public class VaccineTrackerNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccineTrackerNotificationApplication.class, args);
	}

}
