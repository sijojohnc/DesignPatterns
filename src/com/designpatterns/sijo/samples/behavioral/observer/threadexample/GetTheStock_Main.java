/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.observer.threadexample;

import com.designpatterns.sijo.samples.behavioral.observer.Observer;
import com.designpatterns.sijo.samples.behavioral.observer.StockGrabber;
import com.designpatterns.sijo.samples.behavioral.observer.StockObserver;
import com.designpatterns.sijo.samples.behavioral.observer.Subject;

/**
 * @author sijo
 *
 */
public class GetTheStock_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject subject = new StockGrabber();
		Observer observer1 = new StockObserver(subject);
		Observer observer2 = new StockObserver(subject);
//		Observer observer3 = new StockObserver(subject);
//		Observer observer4 = new StockObserver(subject);
		
		((StockGrabber)subject).setIbmPrice(150.00);
		((StockGrabber)subject).setAaplPrice(111.04);
		((StockGrabber)subject).setGoogPrice(662.20);
		
		Runnable getIBM = new GetTheStock(subject, 2, "IBM", 150.00);
		Runnable getAAPL = new GetTheStock(subject, 2, "AAPL", 111.04);
		Runnable getGOOG = new GetTheStock(subject, 2, "GOOG", 662.20);

		Thread ibmThread = new Thread(getIBM);
		Thread aaplThread = new Thread(getAAPL);
		Thread googThread = new Thread(getGOOG);
		ibmThread.start();
		aaplThread.start();
		googThread.start();
				
	}

}
