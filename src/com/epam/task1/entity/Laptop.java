package com.epam.task1.entity;

public class Laptop extends Device {

	private String cpuModel;
	private int ram;
	private int hddCapacity;
	private boolean pluggedIntoASocket = false;

	public String getCpuModel() {
		return cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHddCapacity() {
		return hddCapacity;
	}

	public void setHddCapacity(int hddCapacity) {
		this.hddCapacity = hddCapacity;
	}

	public boolean isPluggedIntoASocket() {
		return pluggedIntoASocket;
	}

	public void setPluggedIntoASocket(boolean pluggedIntoASocket) {
		this.pluggedIntoASocket = pluggedIntoASocket;
	}

	@Override
	public void powerOn() {
		this.setPowerOn(true);
	}

	@Override
	public void powerOff() {
		this.setPowerOn(false);
	}

	public void playMovie(String movieTitle) {
		if (this.isPowerOn()) {
			System.out.println(movieTitle + " is on the screen.");
		} else {
			System.out.println("Power on the laptop!");
		}
	}

	public void playMusic(String songTitle) {
		if (this.isPowerOn()) {
			System.out.println(songTitle + " is playing: la-la-la-la-la.");
		} else {
			System.out.println("Power on the laptop!");
		}
	}

	public void runProgram(String programName) {
		if (this.isPowerOn()) {
			System.out.println(programName + " is running.");
		} else {
			System.out.println("Power on the laptop!");
		}
	}

	public Laptop() {
		super("Laptop", 250);
		this.cpuModel = "Intel Core i5";
		this.ram = 16;
		this.hddCapacity = 1024;
	}

	public Laptop(String deviceName, double capacity, String cpuModel, int ram, int hddCapacity) {
		super(deviceName, capacity);
		this.cpuModel = cpuModel;
		this.ram = ram;
		this.hddCapacity = hddCapacity;
	}

	@Override
	public String toString() {
		return "Laptop [DeviceName=" + getDeviceName() + ", cpuModel=" + cpuModel + ", ram=" + ram + ", hddCapacity="
				+ hddCapacity + ", pluggedIntoASocket=" + pluggedIntoASocket + ", isPowerOn()=" + isPowerOn()
				+ ", getCapacity()=" + getCapacity() + "]";
	}

}
