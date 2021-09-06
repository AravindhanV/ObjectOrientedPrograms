package com.bridgelabz.inventorymanagement;

public class Inventory implements Comparable<Inventory>{
	private String name;
	private Double weight;
	private Double pricePerKG;
	
	public Inventory(String name, Double weight, Double pricePerKG) {
		this.name=name;
		this.weight=weight;
		this.pricePerKG=pricePerKG;
	}
	
	public Double calculateValue() {
		return weight * pricePerKG;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getPricePerKG() {
		return pricePerKG;
	}

	public void setPricePerKG(Double pricePerKG) {
		this.pricePerKG = pricePerKG;
	}

	@Override
	public int compareTo(Inventory arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
