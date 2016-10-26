package com.jpmorgan.stocks.simple.persistence;

import java.util.ArrayList;
import java.util.HashMap;

import com.jpmorgan.stocks.simple.model.Stock;
import com.jpmorgan.stocks.simple.model.Trade;


public interface StocksEntityManager {
	
	public boolean recordTrade(Trade trade) throws Exception;
	public ArrayList<Trade> getTrades();
	public Stock getStockBySymbol(String stockSymbol);
	public HashMap<String, Stock> getStocks();
}
