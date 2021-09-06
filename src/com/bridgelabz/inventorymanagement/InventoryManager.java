package com.bridgelabz.inventorymanagement;

import java.util.Scanner;

import com.bridgelabz.datastructures.LinkedList;
import com.bridgelabz.datastructures.Node;

public class InventoryManager {
	public static Scanner scanner = new Scanner(System.in);
	public static LinkedList<Inventory> inventoryList;
	public static InventoryFactory inventoryFactory = new InventoryFactory();
	
	public static void main(String[] args) {
		inventoryList = new LinkedList();
		System.out.println("Enter number of inventories");
		int noOfInventories = Integer.parseInt(scanner.nextLine());
		
	}
	
	public static void createInventories(int noOfInventories) {
		for(int count=0;count<noOfInventories;count++) {
			System.out.println("Enter name of inventory");
			Inventory inventory = inventoryFactory.createInventory(scanner.nextLine());
			inventoryList.append(new Node(inventory));
		}
	}
}
