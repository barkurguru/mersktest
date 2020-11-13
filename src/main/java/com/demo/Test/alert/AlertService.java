package com.demo.Test.alert;

import java.util.Date;
import java.util.UUID;

public class AlertService {
	
	public AlertService(AlertDAO aDao) {
	}
	
	private final MapAlertDAO storage = new MapAlertDAO();

	public UUID raiseAlert(AlertDAO aDao) {
		return this.storage.addAlert(new Date());
	}

	public Date getAlertTime(UUID id, AlertDAO aDao) {
		return this.storage.getAlert(id);
	} 

}
	
