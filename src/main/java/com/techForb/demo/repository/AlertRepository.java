package com.techForb.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import com.techForb.demo.entity.TotalAlertsEntity;

public interface AlertRepository extends JpaRepository<TotalAlertsEntity,Integer>{
	
	@Procedure("total_alerts")
	public TotalAlertsEntity getTotalAlerts();
	
}
