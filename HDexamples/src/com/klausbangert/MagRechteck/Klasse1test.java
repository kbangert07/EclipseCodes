package com.klausbangert.MagRechteck;

public class Klasse1test {

	public static void main(String[] args) {
	int matrNr = 691943; // Hier Ihre Matrikelnummer eintragen!
	 Komponente p, q;
	 double x=3 ;
	 //f(x)=null;
	 int i;
	 p = new Komponente();
	 p.ref = null;
	 p.wert = matrNr % 10;
	 matrNr = matrNr / 10;
	 for (i=2; i <= 3; i++) {
	 q = new Komponente();
	 q.ref = p;
	 p = q;
	 p.wert = matrNr % 10;
	 matrNr = matrNr / 10;
	 }
	 for (i=1; i <= 3; i++) {
	 System.out.print(p.wert);
	 p = p.ref;
	 }
	// System.out.println(f(3));
	 }
	 }