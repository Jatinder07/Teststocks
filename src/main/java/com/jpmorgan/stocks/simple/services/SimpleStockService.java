package com.jpmorgan.stocks.simple.services;

import com.jpmorgan.stocks.simple.model.Trade;

/**
 *
 *
 */
public interface SimpleStockService {
	
	/**
	 * Calculates the dividend yield for a given stock.
	 */
	public double calculateDividendYield(String stockSymbol) throws Exception;
	
	/**
	 * Calculates the P/E Ratio for a given stock.
	 * 
	 */
	public double calculatePERatio(String stockSymbol) throws Exception;
	
	/**
	 * Record a trade in the Super Simple Stocks application.
	 * 
	 */
	public boolean recordTrade(Trade trade) throws Exception;
	
	/**
	 * 
	 */
	public double calculateStockPrice(String stockSymbol) throws Exception;
	
	/**
	 * Calculates the GBCE All Share Index using the geometric mean of prices for all stocks.
	 * @return
	 * @throws Exception
	 */
	public double calculateGBCEAllShareIndex() throws Exception;
	

}
