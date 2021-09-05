package com.bridgelabz.commercialprocessing;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.bridgelabz.datastructures.Queue;
import com.bridgelabz.datastructures.Stack;

public class StockAccount {
	private ArrayList<CompanyShares> companyShares;
	private Stack<String> buyStack;
	private Stack<String> sellStack;
	private Queue<String> buyQueue;
	private Queue<String> sellQueue;
	public StockAccount() {
		companyShares = new ArrayList<>();		
		buyStack = new Stack<>();
		sellStack = new Stack();
		buyQueue = new Queue<>();
		sellQueue = new Queue<>();
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
		buyStack.push(symbol);
		buyQueue.enQueue(LocalDateTime.now().toString());
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
		sellStack.push(symbol);
		sellQueue.enQueue(LocalDateTime.now().toString());
	}
	
	public void save() {
		
	}
	
	public void printReport() {
		
	}
}
