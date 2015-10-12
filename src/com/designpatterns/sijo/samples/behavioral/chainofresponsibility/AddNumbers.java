/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.chainofresponsibility;

/**
 * @author sijo
 *
 */
public class AddNumbers implements Chain {

	private Chain nextChain;
	
	/**
	 * 
	 */
	public AddNumbers() {
		super();
	}

	/**
	 * @param nextChain
	 */
	public AddNumbers(Chain nextChain) {
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
		
		if("add".equalsIgnoreCase(request.getCalcMethod()))
			System.out.println("Add Numbers ("+request.getNumber1() + " + "+request.getNumber2()+") = "+(request.getNumber1() + request.getNumber2()));
		else{
			System.out.println("Passing to Next Chain");
			nextChain.calculate(request);
		}
	}

}
