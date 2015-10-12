/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.chainofresponsibility;

/**
 * @author sijo
 *
 */
public class TetsCalcChain_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Chain chainadd = new AddNumbers();
		Chain chainsub = new SubNumbers();
		Chain chainmul = new MultiNumbers();
		Chain chaindiv = new DiviNumbers();

		chainadd.setNextChain(chainsub);
		chainsub.setNextChain(chainmul);
		chainmul.setNextChain(chaindiv);
		
		Numbers numadd = new Numbers(10, 25, "add");
		Numbers nummul = new Numbers(15, 25, "mul");
		Numbers numsub = new Numbers(86, 19, "sub");
		Numbers numdiv = new Numbers(135, 45, "div");
		chainadd.calculate(numadd);
		chainadd.calculate(nummul);
		chainadd.calculate(numsub);
		chainadd.calculate(numdiv);
		
	}

}
