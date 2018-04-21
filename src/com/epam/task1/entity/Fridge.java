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

	public Fridge(String deviceName, int capacity, boolean deepFreezerAvailable) {
		super(deviceName, capacity);
		this.deepFreezerAvailable = deepFreezerAvailable;
	}

	@Override
	public String toString() {
		//добавь здесь вместо просто слова Fridge - что-то типа getClass().getSimpleName()
		//чтобы при переименовании класса или пакета не пришлось менять метод toString - об этом еще поговорим потом
		return "Fridge [deepFreezerAvailable=" + deepFreezerAvailable + ", doorOpened=" + doorOpened
				+ ", DDeviceName=" + getDeviceName() + ", Capacity=" + getCapacity() + ", PowerOn="
				+ isPowerOn() + "]";
	}
}
