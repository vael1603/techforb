package com.techForb.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techForb.demo.entity.PlantEntity;
import com.techForb.demo.entity.TotalAlertsEntity;
import com.techForb.demo.services.PlantService;

@RestController
@RequestMapping("/api/")
public class PlantController {
	
	@Autowired
	private PlantService plantService;
	
	@ResponseBody
	@RequestMapping(value="totalAlerts", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public TotalAlertsEntity getTotalAlerts() throws Exception {
		TotalAlertsEntity totalAlertsEntity = plantService.getTotalAlerts();
		return totalAlertsEntity;
	}
	
	@ResponseBody
	@RequestMapping(value="plants", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PlantEntity> getPlants() throws Exception {
		List<PlantEntity> plantEntityList = plantService.getPlants();
		return plantEntityList;
	}
	
	@ResponseBody
	@RequestMapping(value="plant/edit", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public PlantEntity setPlant(@RequestBody PlantEntity plant ) throws Exception {
		
		PlantEntity plantModified = new PlantEntity();
		plantModified = plantService.setPlant(plant);
		return plantModified;
	}

	@ResponseBody
	@RequestMapping(value="plant/delete/{id}", method=RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deletePlant(@PathVariable(required=true, name="id") Integer id) throws Exception {
		plantService.deletePlant(id);
	}
}
