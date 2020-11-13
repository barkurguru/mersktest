package com.demo.Test.weather;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
class FakeThermometer implements Thermometer {
	private int currentTemperature = 21;

	@Override
	public int measure() {
		System.out.println("Inside FakeThermometer at : "+new Date());
		return currentTemperature++; 
	}
}

