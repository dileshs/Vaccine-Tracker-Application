package com.dilesh.VaccineTrackerNotificationApplication.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty
	List<Centers> centers;

	public List<Centers> getCenters() {
		return centers;
	}

	public void setCenters(List<Centers> centers) {
		this.centers = centers;
	}

	@Override
	public String toString() {
		return "Response [centers=" + centers + "]";
	}

}
