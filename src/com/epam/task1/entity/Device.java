package com.epam.task1.entity;

import java.util.Comparator;

import com.epam.task1.service.PowerInterface;

public abstract class Device implements PowerInterface {
	private String deviceName;
	private int capacity;
	private boolean powerOn = false;

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public int getCapacity() {
		return capacity;
	}

	void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isPowerOn() {
		return this.powerOn;
	}

	void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}

	public Device() {
		super();
	}

	public Device(String deviceName, int capacity) {
		super();
		this.deviceName = deviceName;
		this.capacity = capacity;
	}
	
	public static final Comparator<Device> COMPARE_BY_CAPACITY = new Comparator<Device>() {
        @Override
        public int compare(Device lhs, Device rhs) {
            return lhs.getCapacity() - rhs.getCapacity();
        }
    };
}
