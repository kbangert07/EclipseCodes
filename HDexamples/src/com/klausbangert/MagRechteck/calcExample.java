 package com.klausbangert.MagRechteck;

import java.util.Random;

//import java.util.Random;
public class calcExample 
{
	public static void main(String[] args) 
	{
	int y1, x1=5;
	double y2, a2, x2;
	int a =3;
	y1=lincalc(x1,a);
	System.out.printf("Minimum aus x1 und a = %d", y1);
	}
	
	public static int lincalc(int x1,int a)
{
int y1;
y1=Math.min(x1, a);
return y1;
}
	
}