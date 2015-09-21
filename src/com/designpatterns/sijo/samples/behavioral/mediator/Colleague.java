/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.mediator;

/**
 * @author sijo
 *
 */
public abstract class Colleague {
	
	private Mediator mediator ;
	
	private int colleagueCode ;
	
	/**
	 * @param mediator
	 */
	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	public void saleOffer(String stock, int shares){
		mediator.saleOffer(stock, shares, this.colleagueCode);
	}
	
	public void buyOffer(String stock, int shares){
		mediator.buyOffer(stock, shares, this.colleagueCode);
	}
	
	public void setColleagueCode(int colleagueCode){
		this.colleagueCode = colleagueCode;
	}
	
}
