package com.jpmorgan.stocks.simple.model;

public class Stock {
	
	private String stockSymbol;
	
	private StockType stockType;
	
	private double lastDividend;
	
	private double fixedDividend;

	private double parValue;

	private double tickerPrice; 
	
	public Stock(){
		
	}

	/**
	 * 
	 * @return
	 */
	public String getStockSymbol() {
		return stockSymbol;
	}

	/**
	 * 
	 * @param stockSymbol
	 */
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	/**
	 * 
	 * @return
	 */
	public StockType getStockType() {
		return stockType;
	}

	/**
	 * 
	 * @param stockType
	 */
	public void setStockType(StockType stockType) {
		this.stockType = stockType;
	}

	/**
	 * 
	 * @return
	 */
	public double getLastDividend() {
		return lastDividend;
	}

	/**
	 * 
	 * @param lastDividend
	 */
	public void setLastDividend(double lastDividend) {
		this.lastDividend = lastDividend;
	}

	/**
	 * 
	 * @return
	 */
	public double getFixedDividend() {
		return fixedDividend;
	}

	/**
	 * 
	 * @param fixedDividend
	 */
	public void setFixedDividend(double fixedDividend) {
		this.fixedDividend = fixedDividend;
	}

	/**
	 * 
	 * @return
	 */
	public double getParValue() {
		return parValue;
	}

	/**
	 * 
	 * @param parValue
	 */
	public void setParValue(double parValue) {
		this.parValue = parValue;
	}

	/**
	 * 
	 * @return
	 */
	public double getDividendYield() {
		double dividendYield = 0;
		if(tickerPrice > 0){
			if( stockType==StockType.COMMON){
				dividendYield = lastDividend / tickerPrice;
			}else{
				// PREFERRED
				dividendYield = (fixedDividend * parValue ) / tickerPrice;
			}
		}
		return dividendYield;
	}


	/**
	 * 
	 * @return
	 */
	public double getPeRatio() {
		double peRatio = 0;
		
		if(tickerPrice > 0){
			peRatio = tickerPrice / getDividendYield();	
		}
		
		return peRatio;
	}

	/**
	 * 
	 * @return
	 */
	public double getTickerPrice() {
		return tickerPrice;
	}

	/**
	 * 
	 * @param tickerPrice
	 */
	public void setTickerPrice(double tickerPrice) {
		this.tickerPrice = tickerPrice;

	}
	
	@Override
	public String toString() {
		String pattern = "Stock Object [stockSymbol: %s, stockType: %s, lastDividend: %7.0f, fixedDividend: %7.2f, parValue: %7.2f]";
		return String.format(pattern, stockSymbol, stockType, lastDividend, fixedDividend, parValue);
	}
	
}
