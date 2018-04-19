package com.epam.task1.entity;

public class Radio extends MediaDevice {

	public void playMusic() {
		if (this.isPowerOn()) {
			if (this.getCurrentChannel() != null) {
				System.out.println(this.getCurrentChannel() + " is playing: la-la-la");
			} else {
				System.out.println("Tune the radio");
			}
		} else {
			System.out.println("Turn on the radio!");
		}
	}

	public void tuneRadio(String stationName) {
		this.setCurrentChannel(stationName);
	}

	@Override
	public void powerOn() {
		this.setPowerOn(true);
	}

	@Override
	public void powerOff() {
		this.setPowerOn(false);
	}

	public Radio() {
		super("Radio", 5);
	}

	public Radio(String deviceName, int capacity) {
		super(deviceName, capacity);
	}

	@Override
	public String toString() {
		return "Radio [CurrentChannel=" + getCurrentChannel() + ", DeviceName=" + getDeviceName()
				+ ", Capacity=" + getCapacity() + ", PowerOn=" + isPowerOn() + "]";
	}
	
	

}
