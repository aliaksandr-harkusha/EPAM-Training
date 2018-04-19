package com.epam.task1.entity;

public class Fridge extends Device {

	private boolean deepFreezerAvailable = true;
	private boolean doorOpened = false;

	public boolean isDeepFreezerAvailable() {
		return deepFreezerAvailable;
	}

	public void openFridgeDoor() {
		this.doorOpened = true;
	}

	public void closeFridgeDoor() {
		this.doorOpened = false;
	}

	public boolean isDoorOpened() {
		return this.doorOpened;
	}

	@Override
	public void powerOn() {
		this.setPowerOn(true);
	}

	@Override
	public void powerOff() {
		this.setPowerOn(false);
	}
	
	public Fridge() {
		super("Fridge", 40);
	}

	public Fridge(String deviceName, double capacity, boolean deepFreezerAvailable, boolean doorOpened) {
		super(deviceName, capacity);
		this.deepFreezerAvailable = deepFreezerAvailable;
		this.doorOpened = doorOpened;
	}

	@Override
	public String toString() {
		return "Fridge [deepFreezerAvailable=" + deepFreezerAvailable + ", doorOpened=" + doorOpened
				+ ", DDeviceName=" + getDeviceName() + ", Capacity=" + getCapacity() + ", PowerOn="
				+ isPowerOn() + "]";
	}
}
