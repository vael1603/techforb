package com.techForb.demo.services;

import java.util.List;

import com.techForb.demo.entity.PlantEntity;
import com.techForb.demo.entity.TotalAlertsEntity;

public interface PlantService {
	
	public TotalAlertsEntity getTotalAlerts() throws Exception;
	
	public List<PlantEntity> getPlants() throws Exception;
	
	public PlantEntity setPlant(PlantEntity plant) throws Exception;

	void deletePlant(Integer id) throws Exception;
}
