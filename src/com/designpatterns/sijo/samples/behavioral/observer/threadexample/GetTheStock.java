/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.observer.threadexample;

import java.text.DecimalFormat;

import com.designpatterns.sijo.samples.behavioral.observer.StockGrabber;
import com.designpatterns.sijo.samples.behavioral.observer.Subject;

/**
 * @author sijo
 *
 */
public class GetTheStock implements Runnable {

	private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber;
	
	public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice){
		this.stockGrabber = stockGrabber;
		startTime = newStartTime;
		stock = newStock;
		price = newPrice;
		
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for ( int i = 1; i <= 20 ; i++){
			try{
				Thread.sleep(startTime * 2000);
				
			}catch(InterruptedException ex){}
			
			double randNum = (Math.random()*(.06)) - .03;
			DecimalFormat df = new DecimalFormat("#.##");
			price = Double.valueOf(price + randNum);
			if("IBM".equalsIgnoreCase(stock)) 
				((StockGrabber)stockGrabber).setIbmPrice(price);
			else if("GOOG".equalsIgnoreCase(stock)) 
				((StockGrabber)stockGrabber).setGoogPrice(price);
			if("AAPL".equalsIgnoreCase(stock)) 
				((StockGrabber)stockGrabber).setAaplPrice(price);
			
			System.out.println("Stock "+stock+" :"+df.format(price + randNum)+" "+df.format(randNum));
			System.out.println();
			
		}

	}

}
