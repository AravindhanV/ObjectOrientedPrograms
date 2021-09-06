package com.bridgelabz.inventorymanagement;

public class InventoryFactory {	
	public Inventory createInventory(String name) {
		if(name.equalsIgnoreCase("rice")) {
			return new Inventory("Rice",40.5, 38.8);
		} else if(name.equalsIgnoreCase("wheat")) {
			return new Inventory("Wheat",23.6, 17.5);
		} else if(name.equalsIgnoreCase("pulses")) {
			return new Inventory("Pulses",10.4, 30.5);
		} 
		return null;
	}
}
