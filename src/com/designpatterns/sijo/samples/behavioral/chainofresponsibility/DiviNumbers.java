/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.chainofresponsibility;

/**
 * @author sijo
 *
 */
public class DiviNumbers implements Chain {

	private Chain nextChain;

	
	/**
	 * 
	 */
	public DiviNumbers() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nextChain
	 */
	public DiviNumbers(Chain nextChain) {
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
		if("div".equalsIgnoreCase(request.getCalcMethod()))
			System.out.println("Divide Numbers ("+request.getNumber1() + " / "+request.getNumber2()+") = "+(request.getNumber1() / request.getNumber2()));
		else{
			System.out.println("Only Works for add, sub, mul, div");
//			System.out.println("Passing to Next Chain");
//			nextChain.calculate(request);
		}
	}

}
