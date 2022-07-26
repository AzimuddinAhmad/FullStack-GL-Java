package com.gl.transcation;
import java.util.Scanner;
public class Target {
	public static void main(String[] args) 	{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the transaction count--: ");
		int size = sc.nextInt(); //size 
		int A[] = new int[size]; // array size  
				System.out.println("Enter the values  as per the size--: ") ;
		for(int i=0;i<size;i++)	
	{
			A[i] = sc.nextInt(); //taking values of target
	}
				System.out.println("Eter the target value--:");
		int targetNo = sc.nextInt(); 
		
		while(targetNo-- !=0) 
	{ 
			int flag = 0; 
			int  target; 
				System.out.println("Enter a total target value--:"); 
		target = sc.nextInt();
		long sum =0	;
		
		for(int i=0;i<size;i++) {
			sum += A[i]; 
			if(sum>=target) {
				System.out.println("Given Target reached--:");
				flag = 1;
				break;
		}
	}
		if(flag == 0) {
			System.out.print("Given Target not reached--:");
			return;
			}
		}
	}
}
