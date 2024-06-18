package com.formationkilo.mt;

public abstract class TemplateClass {
	public double templateMethod() {
		int n=operation1();
		double sum=0;
		for(int i=0;i<n;i++) {
			sum+=operation2(i);
		}
		return sum;
	}
	protected abstract double operation2(int i);
	protected abstract int operation1();
	 
}
