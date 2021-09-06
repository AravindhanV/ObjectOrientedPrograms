package com.bridgelabz.commercialprocessing;

import java.time.LocalDateTime;

public class CompanyShares implements Comparable<CompanyShares> {
	public CompanyShares(String symbol,int noOfShares, LocalDateTime dateTime) {
		this.symbol = symbol;
		this.noOfShares = noOfShares;
		this.dataTime = dateTime;
	}
	
	private String symbol;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public LocalDateTime getDataTime() {
		return dataTime;
	}
	public void setDataTime(LocalDateTime dateTime) {
		this.dataTime = dateTime;
	}
	private int noOfShares;
	private LocalDateTime dataTime;
	@Override
	public int compareTo(CompanyShares arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean equals(CompanyShares share) {
		return this.symbol.equalsIgnoreCase(share.getSymbol());
	}
}
