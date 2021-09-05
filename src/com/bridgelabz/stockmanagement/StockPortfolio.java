package com.bridgelabz.stockmanagement;

import java.util.ArrayList;

public class StockPortfolio {
	private final int noOfStocks;
	private ArrayList<Stock> stocks;
	
	public StockPortfolio(int noOfStocks) {
		this.noOfStocks = noOfStocks;
		this.stocks = new ArrayList<Stock>(noOfStocks);
	}
	
	public void addStock(Stock stock) {
		stocks.add(stock);
	}
	
	public void calculateStockValues() {
		int total = 0;
		for(Stock stock : stocks) {
			int stockValue = stock.getSharePrice() * stock.getNoOfShares();
			System.out.println("Value of "+stock.getShareName()+ " : "+stockValue);
			total += stockValue;
		}
		System.out.println("Total Valye of all stocks : "+ total);
	}
}
