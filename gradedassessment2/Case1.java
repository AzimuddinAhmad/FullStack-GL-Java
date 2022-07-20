package com.greatlearning.gradedassessment2;
import java.util.Scanner;
public class Case1 {
public void case1 () {
//	public static void main(String[] args) {
						System.out.println("Enter the total no of floors in the building : ") ; 
						Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();	
						System.out.println("enter the floor size given on day : 1 ");	
	int floorSize1 = sc.nextInt();
						System.out.println("enter the floor size given on day : 2 ");
	int floorSize2 = sc.nextInt() ;
						System.out.println("enter the floor size given on day : 3 ");
	int floorSize3 = sc.nextInt() ;
	System.out.println("The order of construction is as follows : \nDay : 1  \n"+floorSize1 +"\nDay : 2  \n"   +"\nDay : 3  \n" +floorSize3 +" "+floorSize2 ) ;
						System.out.println("-------------------------------------------------------------") ;			
	}
	}