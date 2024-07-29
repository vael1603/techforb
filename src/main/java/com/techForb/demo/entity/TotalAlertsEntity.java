package com.techForb.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TotalAlertsEntity {

	@Id
	@Column(name="total_readings")
	private Integer totalReadings;
	
	@Column(name="total_middle_alerts")
	private Integer totalMiddleAlert;
	
	@Column(name="total_red_alerts")
	private Integer totalRedAlert;
	
	@Column(name="total_disabled_sensors")
	private Integer totalDisabledSensors;

	public Integer getReadings() {
		return totalReadings;
	}
	public void setReadings(Integer readings) {
		this.totalReadings = readings;
	}
	public Integer getMiddleAlert() {
		return totalMiddleAlert;
	}
	public void setMiddleAlert(Integer middleAlert) {
		this.totalMiddleAlert = middleAlert;
	}
	public Integer getRedAlert() {
		return totalRedAlert;
	}
	public void setRedAlert(Integer redAlert) {
		this.totalRedAlert = redAlert;
	}
	public Integer getDisabledSensors() {
		return totalDisabledSensors;
	}
	public void setDisabledSensors(Integer disabledSensors) {
		this.totalDisabledSensors = disabledSensors;
	}
	
}
