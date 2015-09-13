/**
 * 
 */
package com.designpatterns.sijo.samples.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sijo
 *
 */
public class MainVisitor {

	List<Visitable> listVisitable = new ArrayList<Visitable>();
	
	/**
	 * @return the listVisitable
	 */
	public List<Visitable> getListVisitable() {
		return listVisitable;
	}

	/**
	 * @param listVisitable the listVisitable to set
	 */
	public void setListVisitable(List<Visitable> listVisitable) {
		this.listVisitable = listVisitable;
	}

	public void calculateTax(Visitor visitor){
		for(Visitable eachItem : listVisitable ){
			eachItem.accept(visitor);
		}
	}
	
	public void printPrice(){
		for(Visitable eachItem : listVisitable ){
			System.out.print(eachItem.getPrice());
		}
	}
	
	public void printTax(){
		for(Visitable eachItem : listVisitable ){
			System.out.print("  "+eachItem.getTax());
		}
	}
	
	public void printTotalPrice(){
		for(Visitable eachItem : listVisitable ){
			System.out.print(eachItem.getPrice()+"  "+eachItem.getTax()+"  "+(eachItem.getPrice()+eachItem.getTax())+"\n");
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainVisitor mainVisitor = new MainVisitor();
		
		Visitable malbro = new Tubacco(1);
		
		Visitable glenlivit = new Liquor(45);
		
		Visitable milk = new Necessity(2.5);
		
		Visitor taxVisitor = new TaxVisitor();
		
		mainVisitor.getListVisitable().add(malbro);
		mainVisitor.getListVisitable().add(glenlivit);
		mainVisitor.getListVisitable().add(milk);
		
		mainVisitor.calculateTax(taxVisitor);
		
		mainVisitor.printTotalPrice();
		
	}

}
