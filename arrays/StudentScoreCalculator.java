package com.greatlearning.arrays;
public class StudentScoreCalculator {
public void calculateSumAndAverage(String sName, String sAddress, int... scores) 
{
			double average = 0.0 ;
			int sum = 0 ;
			for (int i =0; i< scores.length; i++) 
	{
			sum = sum+scores [i] ;
	}
		int size = scores.length;
	
		average = sum / size;
		System.out.println("Student details are : ");
		System.out.println ("Student Name is :  " +sName) ;
		System.out.println ("Student Address is : " +sAddress) ;
		System.out.println ("The scores are : ") ;
		for (int i = 0; i<scores.length; i++)
	{	
		System.out.print(" :  "+ scores [i]) ;
	}
		System.out.println () ;
		System.out.println("The sum of your score is: "+sum) ;
		System.out.println("The average of your scores is "+ average) ;
		System.out.println("-------------------------------");
	}
		public static void main(String[] args) {
			StudentScoreCalculator ssc = new StudentScoreCalculator () ;
			ssc.calculateSumAndAverage("Harsha", "RNTnagar", 89,90,78,78);
			ssc.calculateSumAndAverage("Manish", "NaviNagar", 40,50,60,70,90);
			ssc.calculateSumAndAverage("Ramesh", "RjdNagar", 89,90,78);
	}
}
