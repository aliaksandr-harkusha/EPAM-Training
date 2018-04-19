package com.epam.task1.entity;

public abstract class MediaDevice extends Device {

	private String currentChannel;

	public String getCurrentChannel() {
		return currentChannel;
	}

	void setCurrentChannel(String currentChannel) {
		this.currentChannel = currentChannel;
	}

	MediaDevice() {
		super();
	}

	MediaDevice(String deviceName, double capacity) {
		super(deviceName, capacity);
	}
}
