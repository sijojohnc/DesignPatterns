/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.chainofresponsibility;

/**
 * @author sijo
 *
 */
public class SubNumbers implements Chain {

	private Chain nextChain;

	
	/**
	 * 
	 */
	public SubNumbers() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nextChain
	 */
	public SubNumbers(Chain nextChain) {
		super();
		this.nextChain = nextChain;
	}
	
//	/**
//	 * @return the nextChain
//	 */
//	public Chain getNextChain() {
//		return nextChain;
//	}

	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.behavioral.chainofresponsibility.Chain#setNextChain(com.designpatterns.sijo.samples.behavioral.chainofresponsibility.Chain)
	 */
	@Override
	public void setNextChain(Chain chain) {
		this.nextChain = chain;
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.sijo.samples.behavioral.chainofresponsibility.Chain#calculate(com.designpatterns.sijo.samples.behavioral.chainofresponsibility.Numbers)
	 */
	@Override
	public void calculate(Numbers request) {
		if("sub".equalsIgnoreCase(request.getCalcMethod()))
			System.out.println("Substract Numbers ("+request.getNumber1() + " - "+request.getNumber2()+") = "+(request.getNumber1() - request.getNumber2()));
		else{
			System.out.println("Passing to Next Chain");
			nextChain.calculate(request);
		}
	}

}
