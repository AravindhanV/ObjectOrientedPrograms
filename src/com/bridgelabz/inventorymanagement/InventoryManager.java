package com.bridgelabz.inventorymanagement;

public class InventoryManager {
	public static void main(String[] args) {
		Inventory rice=new Inventory("Rice",40.5, 38.8);
		Inventory wheat=new Inventory("Wheat",23.6, 17.5);
		Inventory pulses=new Inventory("Pulses",10.4, 30.5);
		
		System.out.println("Value of "+rice.getName()+" : "+rice.calculateValue());
		System.out.println("Value of "+wheat.getName()+" : "+wheat.calculateValue());
		System.out.println("Value of "+pulses.getName()+" : "+pulses.calculateValue());
	}
}
