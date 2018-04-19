package com.epam.task1.service;

import java.util.List;

import com.epam.task1.entity.Device;

public class SelectionService {

	public static void select(List<Device> list, int capacity, String order) {
		if (order.equals("less")) {
			list.forEach((device) -> {
				if (device.getCapacity() < capacity) {
					System.out.println(device);
				}
			});
		} else if (order.equals("more")) {
			list.forEach((device) -> {
				if (device.getCapacity() > capacity) {
					System.out.println(device);
				}
			});
		}
	}

}
