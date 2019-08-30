package com.klausbangert.MagRechteck;

public class ExampleMethods {

	public static void main(String[] args) {
	System.out.println("in main()");
	m1();
	System.out.println("Wieder in main()");
	}
	public static void m1()
	{
		int i =1, x=2;
		System.out.println("(In m1() i="+i+"x="+x);
		Komponente.m2(i,x);
	}
	}