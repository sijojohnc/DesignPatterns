package com.designpatterns.sijo.samples.behavioral.visitor;

public interface Visitor {
	
	public double visit(Liquor liquorItem);
	public double visit(Tubacco tubaccoItem);
	public double visit(Necessity necessityItem);
	
}
