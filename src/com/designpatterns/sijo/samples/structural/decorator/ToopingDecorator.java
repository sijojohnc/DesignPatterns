/**
 * 
 */
package com.designpatterns.sijo.samples.structural.decorator;

/**
 * @author sijo
 *
 */
public class ToopingDecorator implements Pizza {
	
	protected Pizza tempPizza;
	
	public ToopingDecorator(Pizza pizza){
		tempPizza = pizza;
	}
	
	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.structural.decorator.Pizza#getDescription()
	 */
	@Override
	public String getDescription() {
		return tempPizza.getDescription();
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.structural.decorator.Pizza#getCost()
	 */
	@Override
	public double getCost() {
		return tempPizza.getCost();
	}

}
