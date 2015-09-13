/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.visitor;

/**
 * @author sijo
 *
 */
public class Liquor implements Visitable{

	private double price;
	private double tax;
	
	/**
	 * 
	 */
	public Liquor() {
		super();
	}

	/**
	 * @param price
	 */
	public Liquor(double price) {
		super();
		this.price = price;
	}

	/**
	 * @param price
	 * @param tax
	 */
	public Liquor(double price, double tax) {
		super();
		this.price = price;
		this.tax = tax;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the tax
	 */
	public double getTax() {
		return tax;
	}

	/**
	 * @param tax the tax to set
	 */
	public void setTax(double tax) {
		this.tax = tax;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.behavioral.visitor.Visitable#accept(com.designpatterns.sijo.samples.behavioral.visitor.Visitor)
	 */
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
