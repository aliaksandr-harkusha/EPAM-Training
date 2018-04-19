package com.epam.task1.entity;

import com.epam.task1.service.PowerInterface;

abstract class Device implements PowerInterface {
	private String deviceName;
	private double capacity;
	private boolean powerOn = false;

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public double getCapacity() {
		return capacity;
	}

	void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public boolean isPowerOn() {
		return this.powerOn;
	}

	void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}

	Device() {
		super();
	}

	Device(String deviceName, double capacity) {
		super();
		this.deviceName = deviceName;
		this.capacity = capacity;
	}
}
