package com.dilesh.VaccineTrackerNotificationApplication.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dilesh.VaccineTrackerNotificationApplication.service.VaccineTrackerImpl;

@RestController
public class VaccineTrackerController {

	@Autowired
	private VaccineTrackerImpl trackerImpl;

	@GetMapping(value = "/track")
	public void triggerVaccineTracker() {
		try {
			trackerImpl.trackerOrchestrator();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
