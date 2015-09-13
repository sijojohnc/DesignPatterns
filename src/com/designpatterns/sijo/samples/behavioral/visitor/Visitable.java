/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.visitor;

/**
 * @author sijo
 *
 */
public interface Visitable {

	public void setPrice(double price);
	public double getPrice();
	public void setTax(double computedTaxAmountOnPrice);
	public double getTax();	
	public double accept(Visitor visitor);
}
