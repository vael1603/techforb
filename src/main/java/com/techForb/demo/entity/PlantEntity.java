package com.techForb.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PlantEntity {

	@Id
	private Integer id;
	private String country;
	private String name;
	private Integer readings;
	private Integer middleAlerts;
	private Integer redAlerts;
	private Integer disabledSensors;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getReadings() {
		return readings;
	}

	public void setReadings(Integer readings) {
		this.readings = readings;
	}

	public Integer getMiddleAlert() {
		return middleAlerts;
	}

	public void setMiddleAlert(Integer middleAlert) {
		this.middleAlerts = middleAlert;
	}

	public Integer getRedAlert() {
		return redAlerts;
	}

	public void setRedAlert(Integer redAlert) {
		this.redAlerts = redAlert;
	}

	public Integer getDisabledSensors() {
		return disabledSensors;
	}

	public void setDisabledSensors(Integer disabledSensors) {
		this.disabledSensors = disabledSensors;
	}
}
