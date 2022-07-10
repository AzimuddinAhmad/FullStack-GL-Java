package com.gl.payments;
import java.time.LocalDate ;
import java.time.LocalTime;
public class Heading 	{
		public static void headLine () 	{
			LocalDate ld = LocalDate.now();
			LocalTime lt = LocalTime.now();	
					System.out.print("~~~~~~~>> Date  : "    +ld) ;
					System.out.println("\t\t\t\tTime  : <<------- "    +lt) ; ;
			String headL1 	= "                               WELCOME TO GREAT LEARNING                " ;
			String headL2    =               "\n                           !~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!" ;
					System.out.println("" +headL1 +" " +headL2) ;		
	}
public static void main (String []args)	{
			headLine () ;
	}
}
	