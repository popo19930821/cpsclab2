package com.google.gwt.sample.stockwatcher.client;

public class StockPrice {

  private String symbol;
  private double price;
  
  private int page;
  private String conflict;
  private double change;
  private String confli;

  public StockPrice() {
  }

  public StockPrice(String symbol, double price, double change) {
    this.symbol = symbol;
    this.price = price;
    this.change = change;
  }
  
  public String getConflict(){
	  return this.conflict;
  }

  public String getSymbol() {
    return this.confli;
  }

  public double getPrice() {
    return this.price;
  }

  public double getChange() {
    return this.change;
  }

  public double getChangePercent() {
    return 100.0 * this.change / this.price;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setChange(double change) {
    this.change = change;
  }
}