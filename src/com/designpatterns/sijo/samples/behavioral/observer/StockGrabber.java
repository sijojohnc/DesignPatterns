/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.observer;

import java.util.ArrayList;

/**
 * @author sijo
 *
 */
public class StockGrabber implements Subject {

	private ArrayList<Observer> observerList;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber(){
		observerList = new ArrayList<Observer>();
	}
	 
	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.behavioral.observer.Subject#register(com.designpatterns.sijo.samples.behavioral.observer.Observer)
	 */
	public void register(Observer newObserver) {
		
		boolean bolVal = observerList.add(newObserver);
		System.out.println("Add Status "+bolVal+"  "+newObserver);
		
	}
 
	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.behavioral.observer.Subject#unregister(com.designpatterns.sijo.samples.behavioral.observer.Observer)
	 */
	public void unregister(Observer deleteObserver) {
		
		observerList.remove(deleteObserver);
		System.out.println("Removing Observer from List");
		
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.behavioral.observer.Subject#notifyObserver()
	 */
	public void notifyObserver() {
		for(Observer observer:observerList){
			observer.update(ibmPrice, aaplPrice, googPrice);
		}

	}

	/**
	 * @return the observerList
	 */
	public ArrayList<Observer> getObserverList() {
		return observerList;
	}

//	/**
//	 * @param observerList the observerList to set
//	 */
//	public void setObserverList(ArrayList<Observer> observerList) {
//		this.observerList = observerList;
//	}

	/**
	 * @return the ibmPrice
	 */
	public double getIbmPrice() {
		return ibmPrice;
	}

	/**
	 * @param ibmPrice the ibmPrice to set
	 */
	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	/**
	 * @return the aaplPrice
	 */
	public double getAaplPrice() {
		return aaplPrice;
	}

	/**
	 * @param aaplPrice the aaplPrice to set
	 */
	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}

	/**
	 * @return the googPrice
	 */
	public double getGoogPrice() {
		return googPrice;
	}

	/**
	 * @param googPrice the googPrice to set
	 */
	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

}
