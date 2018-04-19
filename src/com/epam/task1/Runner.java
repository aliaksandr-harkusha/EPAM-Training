package com.epam.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.epam.task1.entity.*;
import com.epam.task1.service.SelectionService;

public class Runner {
	public static void main(String[] args) {
		
		ArrayList<Device> listOfDevices = new ArrayList<>();
		
		listOfDevices.add(new Radio());
		listOfDevices.add(new TVSet("TV in the livingroom", 25));
		listOfDevices.add(new Laptop());
		listOfDevices.add(new Fridge("Fridge Samsung", 40, false));
		listOfDevices.add(new TVSet());
		
		
		System.out.println("--------------- unsorted -------------");
		listOfDevices.forEach(System.out::println);	
		
		
		System.out.println("--------------- the whole power-capacity -------------");
		int sumCapacity = 0;
		for(Object device : listOfDevices) {
			sumCapacity += ((Device) device).getCapacity();
		}
		System.out.println("\n" + sumCapacity);
		
		
		Collections.sort(listOfDevices, Device.COMPARE_BY_CAPACITY);
		System.out.println("--------------- sorted -------------");
		listOfDevices.forEach(System.out::println);	
		System.out.println();
		
		
		System.out.println("--------------- less then 75 -------------");
		SelectionService.select(listOfDevices, 75, "less");
		System.out.println();
		
		
		System.out.println("--------------- more then 75 -------------");
		SelectionService.select(listOfDevices, 75, "more");
	}
}
