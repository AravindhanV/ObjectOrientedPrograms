package com.bridgelabz.commercialprocessing;

import java.util.ArrayList;

public class StockAccount {
	private ArrayList<CompanyShares> companyShares;
	public StockAccount() {
		companyShares = new ArrayList<>();		
	}
	
	public double valueOf() {
		return 0;
	}
	
	public void buy(int amount, String symbol) {
		symbol = symbol.toUpperCase();
		boolean isFound = false;
		for(CompanyShares share : companyShares) {
			
		}
	}
	
	public void sell(int amount, String symbol) {
		
	}
	
	public void save() {
		
	}
	
	public void printReport() {
		
	}
}
