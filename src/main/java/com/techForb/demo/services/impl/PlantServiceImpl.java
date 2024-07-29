package com.techForb.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techForb.demo.entity.PlantEntity;
import com.techForb.demo.entity.TotalAlertsEntity;
import com.techForb.demo.repository.AlertRepository;
import com.techForb.demo.repository.PlantRepository;
import com.techForb.demo.services.PlantService;

import jakarta.transaction.Transactional;

@Service
public class PlantServiceImpl implements PlantService{

	@Autowired
	PlantRepository plantRepository;
	
	@Autowired
	AlertRepository alertRepository;
	
	@Override
	@Transactional
	public TotalAlertsEntity getTotalAlerts() throws Exception {
		
		TotalAlertsEntity totalAlerts = new TotalAlertsEntity();
		
		try {
			totalAlerts = alertRepository.getTotalAlerts();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalAlerts;
	}

	@Override
	@Transactional
	public List<PlantEntity> getPlants() throws Exception {
		
		List<PlantEntity> plants = new ArrayList<PlantEntity>();
		
		try {
			plants = plantRepository.getPlants();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return plants;
	}

	@Override
	public PlantEntity setPlant(PlantEntity plant) throws Exception {
		
		PlantEntity plantModified = new PlantEntity();
		
		try {
			plantModified = plantRepository.setPlant(
						plant.getId(),
						plant.getCountry(),
						plant.getName(),
						plant.getReadings(),
						plant.getMiddleAlert(),
						plant.getRedAlert(),
						plant.getDisabledSensors()
					);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return plantModified;
	}
	
	@Override
	public void deletePlant(Integer id) throws Exception {
		plantRepository.deletePlant(id);
	}
}
