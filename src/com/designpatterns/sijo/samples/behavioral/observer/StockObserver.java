/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.observer;

/**
 * @author sijo
 *
 */
public class StockObserver implements Observer {

	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	private static int observerIDTracker = 0;
	private int observerID;
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.observerID = ++ StockObserver.observerIDTracker;
		System.out.println("New Observer"+ this.observerID);
		this.stockGrabber.register(this);
	}
	
	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.behavioral.observer.Observer#update(double, double, double)
	 */
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		 this.ibmPrice = ibmPrice;
		 this.aaplPrice = aaplPrice;
		 this.googPrice = googPrice;
		 printThePrices();
	}

	public void printThePrices(){
		System.out.println("\nObserver ID "+observerID+ "\nIBMPrice "+ibmPrice+"\nApplePrice "+aaplPrice+"\nGooglePrice "+googPrice);
	}

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
	}


	/**
	 * @return the observerID
	 */
	public int getObserverID() {
		return observerID;
	}


	/**
	 * @param observerID the observerID to set
	 */
	public void setObserverID(int observerID) {
		this.observerID = observerID;
	}


	/**
	 * @return the stockGrabber
	 */
	public Subject getStockGrabber() {
		return stockGrabber;
	}


	/**
	 * @param stockGrabber the stockGrabber to set
	 */
	public void setStockGrabber(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StockObserver [ibmPrice=" + ibmPrice + ", aaplPrice=" + aaplPrice + ", googPrice=" + googPrice
				+ ", observerID=" + observerID + ", stockGrabber=" + stockGrabber + "]";
	}

	
	
}
