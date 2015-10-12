/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.chainofresponsibility;

/**
 * @author sijo
 *
 */
public class Numbers {
	
	private int number1;
	private int number2;
	private String calcMethod;
	
	/**
	 * 
	 */
	public Numbers() {
		super();
	}

	/**
	 * @param number1
	 * @param number2
	 * @param calcMethod
	 */
	public Numbers(int number1, int number2, String calcMethod) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.calcMethod = calcMethod;
	}

	/**
	 * @return the number1
	 */
	public int getNumber1() {
		return number1;
	}

	/**
	 * @param number1 the number1 to set
	 */
	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	/**
	 * @return the number2
	 */
	public int getNumber2() {
		return number2;
	}

	/**
	 * @param number2 the number2 to set
	 */
	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	/**
	 * @return the calcMethod
	 */
	public String getCalcMethod() {
		return calcMethod;
	}

	/**
	 * @param calcMethod the calcMethod to set
	 */
	public void setCalcMethod(String calcMethod) {
		this.calcMethod = calcMethod;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Numbers [number1=" + number1 + ", number2=" + number2 + ", calcMethod=" + calcMethod + "]";
	}
	
}
