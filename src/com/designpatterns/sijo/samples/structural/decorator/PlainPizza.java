/**
 * 
 */
package com.designpatterns.sijo.samples.structural.decorator;

/**
 * @author sijo
 *
 */
public class PlainPizza implements Pizza {

	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.structural.decorator.Pizza#getDescription()
	 */
	@Override
	public String getDescription() {
		return "Thin Dough";
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.structural.decorator.Pizza#getCost()
	 */
	@Override
	public double getCost() {
		return 4.00;
	}

}
