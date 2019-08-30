package com.klausbangert.hdexamples;
import java.util.Scanner;
import java.util.Arrays;
public class HDexamples {

	public static void main(String[] args) {
		   // Ein 2D Feld aus Strings und Integer ala Schachbrett
	    Scanner keyboard=new Scanner(System.in);
	    int i,j, zeile=26, spalte=26;
	    String buchstab1;
	    
	        boolean fertig = false;
	    while (!fertig) {
	    // Zuerst ein Bildschirmmenue
	    System.out.println("1 = Neuer Eintrag");
	    //System.out.println("2 = Ergebnis ausgeben");
	    System.out.println("2 = Programm beenden");
	    System.out.println("Ihre Auswahl?");
	    int auswahl= keyboard.nextInt();
	    String feld [] [] = new String [zeile] [spalte];
	    int feld1 [] []={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	    int feld2 [] []=new int [3] [4];
	    int feld3 [] []=new int [3] [4];
	    System.arraycopy(feld1,0,feld3,0,feld1.length);
	    feld3[2][1]=400;
	   // feld3 [0] []={1,2,3,4}; liefert Syntax Fehler für reihenweises Einsetzen von Daten im Feld
	  // static void fill (int[3][4] feld2, int 1);
	    int sum=0;    
	    for (i=0; i<feld2.length; i++)
	    {
	        //System.out.print("\t"+"i="+i);
	        System.out.println("\t"+"i="+i);
	            for (j=0; j<feld2[i].length; j++)
	        {
	            feld2[i][j]=feld1[i][j];
	            feld2[1][2]=150;
	            sum=feld3[i][j]+sum; 
	            System.out.print("\t"+"j="+j+"\t"+"feld3(i,j)="+feld3[i][j]);
	                    }
	    System.out.print("\n");
	                }
	    System.out.println("\t"+"Summe der Feldelemente="+sum+"\n");
	    int k=0, l=0, summe=0;
	            for (int[] reihe : feld1) 
	    { 
	                    for (int element : reihe)
	    {
	        summe=summe+element;       
	        System.out.print("Feldausgabe Schleife feld1"+"\t"+"element" +element+"\t"+"summe"+summe+"\n");    
	    }
	}
	     System.out.print("Ergebnisausgabe ENDE Schleife; "+"\t"+"summe" +summe+"\n");

	   
	    switch (auswahl) {
	    case 1: // Feldlaenege eingeben 
	    System.out.println("Definier Laenge Buchstabenfeld zeile <z(26) ");
	    zeile = keyboard.nextInt(); 
	    System.out.println("Definiere Laenge Integerfeld spalte <26");
	    spalte = keyboard.nextInt();
	    
	    if ((spalte < 0 || spalte > 26) ||(zeile<0 || zeile>26))
	    {
	    System.out.println("Eingabefehler!");
	    break;
	    }
	      
	    // 2D Feld initialisieren
	    String letter;
	    String let1="a+";
	    //int a=5;
	  System.out.print("zeilenindex"+zeile+"\t"+"spaltennummer"+"\t"+ spalte+"\n");
	        for ( i = 0; i < spalte; i++) {
	    // Zeile mit erstem Index bis spalte (Index außen)
	            feld [i] = new String [zeile];
	     System.out.print("Feldinitialisierung aussere Schleife"+"\t"+"i="+i+"\t"+"feld [i]="+ feld [i]+"\n" +"\n"); 
	    // Spalte mit zweitem Index bis zeile feld(spalte,zeile) - Index innen,zweiter 
	    for ( j=0; j<zeile; j++){
	        let1=let1+j;
	        feld [i][j]=let1;
	    System.out.print("Feldinitialisierung innere Schleife"+"\t"+"i="+i+"\t"+"j="+j+"\t"+"feld [i] [j]="+ feld [i][j]+"\n");    
	    }
	    }
	    
	       
	    break;
	 //case 2: // Feld ausgeben
	 //   String let="";
	 //   System.out.print("reihe"+reihe +"\t"+"spalte"+"\t"+spalte+"\n");
	    //int k=0, l=0;
	   //         for (int[] reihe : feld1) 
	  //  { 
	        
	    // for (int element : reihe)
	    // {
	       
	    //    System.out.print("Feldausgabe Schleife"+"\t"+"element"+element+"summe"+summe+"\n");    
	    // }
	    // let1=(String)(let1+1);
	    //    feld =let1;
	    //System.out.print("Feldinitialisierung innere Schleife"+"\t"+"element"+element+"zeile"+zeile+"feld(i,j)="+feld [i][j]+"\n"); 
	//}
	// System.out.print("Feldausgabe Schleife"+"\t"+"i="+i+"\t"+"j="+j+"\t"+"feld [i] [j]="+ feld [i][j]+"\n");  
	// System.out.print("Feldausgabe ENDE Schleife"+"\t"+"Summe"+summe+"\n");  
	     //break;
	    case 2: // Programm beenden 
	    fertig = true;
	    break;
	    default: // Falsche Zahl eingegeben
	    System.out.println("Eingabefehler!");
	    }
	    }
	    }
	    }
