package com.classAnd.subclass;

public class ClassA {

	public static void main (String []args) {
		
		System.out.println("This parent class");
			ClassB prmb = new ClassB () ;
			ClassC prmc = new ClassC () ;
			prmb.printMethodB();
			prmc.printMethodC();
		}
	}
