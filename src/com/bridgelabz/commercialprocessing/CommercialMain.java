package com.bridgelabz.commercialprocessing;

import java.time.LocalDateTime;

public class CommercialMain {
	public static void main(String[] args) {

		StockAccount account = new StockAccount();
		account.printReport();
		account.buy(10, "reliance");
		account.sell(10, "tata");
		account.printReport();
	}
}
