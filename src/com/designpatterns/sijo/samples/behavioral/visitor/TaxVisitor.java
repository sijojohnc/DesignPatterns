/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.visitor;

/**
 * @author sijo
 *
 */
public class TaxVisitor implements Visitor {

	@Override
	public double visit(Liquor liquorItem) {
		liquorItem.setTax(liquorItem.getPrice() * .18);
		return  liquorItem.getTax(); 
	}

	@Override
	public double visit(Tubacco tubaccoItem) {
		tubaccoItem.setTax(tubaccoItem.getPrice() * .32);
		return  tubaccoItem.getTax();
	}

	@Override
	public double visit(Necessity necessityItem) {
		necessityItem.setTax(necessityItem.getPrice() * 0 );
		return necessityItem.getTax();
	}

	
	
}
