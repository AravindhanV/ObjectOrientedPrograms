package com.bridgelabz.stockmanagement;

import java.util.Scanner;

public class StockManagementMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many stocks?");
		int noOfStocks = Integer.parseInt(scanner.nextLine());
		StockPortfolio stockPortfolio = new StockPortfolio(noOfStocks);
		System.out.println("Enter the stocks");
		for(int index=0;index<noOfStocks;index++) {
			System.out.println("Enter name, no of shares and share price for stock" + (index+1));
			String stockName = scanner.nextLine();
			int noOfShares = Integer.parseInt(scanner.nextLine());
			int sharePrice = Integer.parseInt(scanner.nextLine());
			Stock stock = new Stock(stockName,noOfShares,sharePrice);
			stockPortfolio.addStock(stock);
		}
	}
}
