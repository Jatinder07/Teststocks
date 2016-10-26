package com.jpmorgan.stocks.simple.arch.utils.impl;

import java.util.Calendar;
import java.util.Date;

public class DatesUtils{

	public DatesUtils(){
		
	}
	
	public Date getNowMovedMinutes(int minutes){
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MINUTE, minutes);
		return now.getTime();
	}
}
