package com.bridgelabz.commercialprocessing;

import java.time.LocalDateTime;
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
			if(share.getSymbol().equals(symbol)) {
				isFound=true;
				int currentAmount = share.getNoOfShares();
				share.setNoOfShares(currentAmount + amount);
				break;
			}
		}
		
		if(!isFound) {
			companyShares.add(new CompanyShares(symbol, amount, LocalDateTime.now()));
		}
	}
	
	public void sell(int amount, String symbol) {
		symbol = symbol.toUpperCase();
		boolean isFound = false;
		for(CompanyShares share : companyShares) {
			if(share.getSymbol().equals(symbol)) {
				isFound=true;
				int currentAmount = share.getNoOfShares();
				if(currentAmount < amount) {
					System.out.println("Insufficient stock amount");
					return;
				}
				share.setNoOfShares(currentAmount - amount);
				break;
			}
		}
		
		if(!isFound) {
			System.out.println("Symbol doesn't exist");
		}
		
	}
	
	public void save() {
		
	}
	
	public void printReport() {
		
	}
}
