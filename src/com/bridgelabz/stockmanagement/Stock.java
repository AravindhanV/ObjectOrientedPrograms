package com.bridgelabz.stockmanagement;

public class Stock {
	private int noOfShares;
	private int sharePrice;
	private String shareName;

	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	
	public int calculateValue() {
		return sharePrice * noOfShares;
	}
}
