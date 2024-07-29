package com.techForb.demo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techForb.demo.entity.PlantEntity;

import jakarta.transaction.Transactional;

public interface PlantRepository extends JpaRepository<PlantEntity,Integer>{
	
	@Query(value="SELECT * FROM plants", nativeQuery=true)
	public ArrayList<PlantEntity> getPlants();
	
	@Query(value="CALL set_plant(:id,:country,:name,:readings,:middle_alerts,:red_alerts,:disabled_sensors)", nativeQuery=true)
	public PlantEntity setPlant(
				@Param("id") Integer id,
				@Param("country") String country,
				@Param("name") String name,
				@Param("readings") Integer readings,
				@Param("middle_alerts") Integer middleAlerts,
				@Param("red_alerts") Integer redAlerts,
				@Param("disabled_sensors") Integer disabledSensors
			);
	
	@Modifying
    @Transactional
	@Query(value="DELETE from plants where id = :id", nativeQuery=true)
	public void deletePlant(@Param("id") Integer id);
}
