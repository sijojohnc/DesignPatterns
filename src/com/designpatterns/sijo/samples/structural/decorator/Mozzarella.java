/**
 * 
 */
package com.designpatterns.sijo.samples.structural.decorator;

/**
 * @author sijo
 *
 */
public class Mozzarella extends ToopingDecorator {

	public Mozzarella(Pizza pizza){
		super(pizza);
		
		System.out.println("Adding Dough");
		
		System.out.println("Adding Moz");
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.structural.decorator.ToopingDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		return super.getDescription()+", Mozzarella";
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.structural.decorator.ToopingDecorator#getCost()
	 */
	@Override
	public double getCost() {
		return super.getCost()+.50;
	}
	
	
	
}
