package com.epam.task1;

public class Radio extends Device {

	private String currentStation;

	public void playStation() {
		if (this.isPowerOn()) {
			if (this.currentStation != null) {
				System.out.println(this.currentStation + "is playing: la-la-la");
			} else {
				System.out.println("Tune the radio");
			}
		} else {
			System.out.println("Turn on the radio!");
		}
	}

	public String getCurrentStation() {
		return currentStation;
	}

	public void setCurrentStation(String currentStation) {
		this.currentStation = currentStation;
	}

	@Override
	public String toString() {
		return "Radio [currentStation=" + currentStation + ", DeviceName=" + getDeviceName() + ", Capacity()="
				+ getCapacity() + ", isPowerOn()=" + isPowerOn() + "]";
	}

}
