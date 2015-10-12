/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.chainofresponsibility;

/**
 * @author sijo
 *
 */
public interface Chain {
	
	public void setNextChain(Chain chain);
	
	public void calculate(Numbers request);
}
