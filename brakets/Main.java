package com.balance.brakets;
import java.util.Stack;
import java.util.Scanner;
	public class Main {
	public static void main(String[] args) 
	{
				Scanner var=new Scanner(System.in);
			String expression;
				System.out.println("Please Enter the expressions : ");
			expression=var.nextLine();
			//   call method here
			BalanceBrakets balancebracket=new BalanceBrakets();
	boolean answer=balancebracket.areBracketsBalanced(expression);
	if(answer)
			System.out.println("Yes, Brackets are Balanced : ");
		else
			System.out.println("NO, Brackets are not Balanced : ");
	}
}