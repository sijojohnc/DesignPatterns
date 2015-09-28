/**
 * 
 */
package com.designpatterns.sijo.samples.structural.decorator;

/**
 * @author sijo
 *
 */
public class TomatoSauce extends ToopingDecorator {
	
	public TomatoSauce(Pizza pizza){
		super(pizza);
		
		System.out.println("Adding Tomato Sauce");
		
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.structural.decorator.ToopingDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		return super.getDescription()+", Tomator Sauce";
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.structural.decorator.ToopingDecorator#getCost()
	 */
	@Override
	public double getCost() {
		return super.getCost()+.35;
	}
}
