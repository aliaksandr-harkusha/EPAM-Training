package com.epam.task1.entity;

public abstract class MediaDevice extends Device {

	private String currentChannel;

	public String getCurrentChannel() {
		return currentChannel;
	}

	void setCurrentChannel(String currentChannel) {
		this.currentChannel = currentChannel;
	}

	public MediaDevice() {
		super();
	}

	public MediaDevice(String deviceName, int capacity) {
		super(deviceName, capacity);
	}
}
