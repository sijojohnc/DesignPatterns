/**
 * 
 */
package com.designpatterns.sijo.samples.structural.decorator;

/**
 * @author sijo
 *
 */
public class PizzaMaker_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}

}
