/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.mediator;

/**
 * @author sijo
 *
 */
public class StockOffer {

	private int stockShares = 0;
	private String stockSymbol = "";
	private int colleagueCode = 0;
	
	/**
	 * @param stockShares
	 * @param stockSymbol
	 * @param colleagueCode
	 */
	public StockOffer(int stockShares, String stockSymbol, int colleagueCode) {
		super();
		this.stockShares = stockShares;
		this.stockSymbol = stockSymbol;
		this.colleagueCode = colleagueCode;
	}
	/**
	 * @return the stockShares
	 */
	public int getStockShares() {
		return stockShares;
	}
	/**
	 * @param stockShares the stockShares to set
	 */
	public void setStockShares(int stockShares) {
		this.stockShares = stockShares;
	}
	/**
	 * @return the stockSymbol
	 */
	public String getStockSymbol() {
		return stockSymbol;
	}
	/**
	 * @param stockSymbol the stockSymbol to set
	 */
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	/**
	 * @return the colleagueCode
	 */
	public int getColleagueCode() {
		return colleagueCode;
	}
	/**
	 * @param colleagueCode the colleagueCode to set
	 */
	public void setColleagueCode(int colleagueCode) {
		this.colleagueCode = colleagueCode;
	}
	
	
	
}
