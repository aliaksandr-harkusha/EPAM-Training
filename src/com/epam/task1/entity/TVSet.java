package com.epam.task1.entity;

public class TVSet extends MediaDevice {

	private boolean pluggedIntoASocket = false;

	public boolean isPluggedIntoASocket() {
		return pluggedIntoASocket;
	}

	public void setPluggedIntoASocket(boolean pluggedIntoASocket) {
		this.pluggedIntoASocket = pluggedIntoASocket;
	}

	public void playChannel() {
		if (this.isPowerOn()) {
			if (this.getCurrentChannel() != null) {
				System.out.println(this.getCurrentChannel() + " is online: Breaking News!");
			} else {
				System.out.println("Set the channel");
			}
		} else {
			System.out.println("Turn on the TV!");
		}
	}

	@Override
	public void powerOn() {
		this.setPluggedIntoASocket(true);
		this.setPowerOn(true);
	}

	@Override
	public void powerOff() {
		this.setPluggedIntoASocket(false);
		this.setPowerOn(false);
	}

	public TVSet() {
		super("TV", 100);
	}

	public TVSet(String deviceName, double capacity) {
		super(deviceName, capacity);
	}

	@Override
	public String toString() {
		return "TVSet [CurrentChannel=" + getCurrentChannel() + ", DeviceName=" + getDeviceName() + ", Capacity="
				+ getCapacity() + ", PowerOn()=" + isPowerOn() + ", PluggedIntoASocket=" + pluggedIntoASocket + "]";
	}

}
