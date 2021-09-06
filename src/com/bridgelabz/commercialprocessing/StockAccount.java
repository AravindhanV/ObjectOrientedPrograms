package com.bridgelabz.commercialprocessing;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.bridgelabz.datastructures.LinkedList;
import com.bridgelabz.datastructures.Node;
import com.bridgelabz.datastructures.NodeIF;
import com.bridgelabz.datastructures.Queue;
import com.bridgelabz.datastructures.Stack;

public class StockAccount {
	private LinkedList<CompanyShares> companyShares;
	private Stack<String> buyStack;
	private Stack<String> sellStack;
	private Queue<String> buyQueue;
	private Queue<String> sellQueue;

	public StockAccount() {
		companyShares = new LinkedList<>();
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
		NodeIF<CompanyShares> node = companyShares.search(new CompanyShares(symbol, 0, null));
		if (node == null) {
			companyShares.append(new Node(new CompanyShares(symbol, amount, LocalDateTime.now())));
		} else {
			int newAmount = node.getKey().getNoOfShares() + amount;
			node.getKey().setNoOfShares(newAmount);
		}

		buyStack.push(symbol);
		buyQueue.enQueue(LocalDateTime.now().toString());
	}

	public void sell(int amount, String symbol) {
		symbol = symbol.toUpperCase();
		boolean isFound = false;
		NodeIF<CompanyShares> node = companyShares.search(new CompanyShares(symbol, 0, null));
		if (node == null) {
			System.out.println("Symbol not found");
		} else {
			int newAmount = node.getKey().getNoOfShares() - amount;
			if (newAmount > 0)
				node.getKey().setNoOfShares(newAmount);
			else
				System.out.println("Not enough shares to sell");
		}
		sellStack.push(symbol);
		sellQueue.enQueue(LocalDateTime.now().toString());
	}

	public void save() {

	}

	public void printReport() {

	}
}
