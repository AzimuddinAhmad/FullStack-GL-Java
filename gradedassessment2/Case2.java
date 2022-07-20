package com.greatlearning.gradedassessment2;
import java.util.Scanner;
public class Case2 {
		public void case2 () {

//		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building : ") ; 
		int size = sc.nextInt();
							System.out.println("enter the floor size given on day : 1 ");
		int floorSize1 = sc.nextInt();
							System.out.println("enter the floor size given on day : 2 ");
		int floorSize2 = sc.nextInt() ;
							System.out.println("enter the floor size given on day : 3 ");
		int floorSize3 = sc.nextInt() ;
							System.out.println("enter the floor size given on day : 4 ");
		int floorSize4 = sc.nextInt() ;	
							System.out.println("enter the floor size given on day : 5 ");
		int floorSize5 = sc.nextInt() ;	
/*
		int amount =sc.nextInt();
		MergeSort mergesort = new MergeSort();
		mergesort.sort(currency,0,currency.length-1);
		NotesCounter.notesCountImplementation(currency,amount);	*/
	System.out.println("The order of construction is as follows : \nDay : 1  \n"+"   " +"\nDay : 2  \n"+floorSize2+ " " + floorSize1   +"\nDay : 3 \n" +"  "+"\nDay : 4 \n" +"  "+"\nDay : 5 \n"+floorSize5+" "+floorSize4+" "+floorSize3);
							System.out.println("-------------------------------------------------------------") ;		
		}
	}