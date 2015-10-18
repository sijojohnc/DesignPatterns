/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.observer;

/**
 * @author sijo
 *
 */
public class GrabStock_Main {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject subject = new StockGrabber();
		Observer observer1 = new StockObserver(subject);
		Observer observer2 = new StockObserver(subject);
		Observer observer3 = new StockObserver(subject);
		Observer observer4 = new StockObserver(subject);
		
		((StockGrabber)subject).setIbmPrice(150.00);
		((StockGrabber)subject).setAaplPrice(111.04);
		((StockGrabber)subject).setGoogPrice(662.20);
		
		
	}
}
