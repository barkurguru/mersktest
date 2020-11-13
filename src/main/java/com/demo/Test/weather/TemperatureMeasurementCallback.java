package com.demo.Test.weather;

@FunctionalInterface
interface TemperatureMeasurementCallback {
	public void temperatureMeasured(int temperature);
}
