package com.klausbangert.MagRechteck;

public class MagRechteck {

	public static void main(String[] args) 
	{
	double x1=5.3;
	double a =3.6;
	TestObject test1=new TestObject();
	test1.rechne(x1,a);
	System.out.println("DaDa.....="+test1.rechne(x1, a));
	test1.rechne(7,4);
	System.out.println("DaDa.....="+test1.rechne(7, 4));
//	System.out.printf("Test 1 hat den wert %1.2f", test1);
//	System.out.println("Test 1 hat den wert ="+test1);
	System.out.println("Ende programmes heute hier");
	}
}