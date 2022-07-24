package com.balance.brakets;
	/*	Q1. Write a program of Balancing Brackets,use a suitable data structure to print whether the string entered is a
	//		Balanced Brackets or unbalanced String	*/
import java.util.Deque;
import java.util.ArrayDeque;
	public class BalanceBrakets {
			//	Here can be chedk input is balance or not balance by method.
		public static boolean areBracketsBalanced(String expression)	{
			Deque<Character> stack=new ArrayDeque<Character>();
		for(int i=0;i< expression.length();i++)		{
				char x=expression.charAt(i);
		if(x=='('|| x=='['|| x=='{')	{
			stack.push(x);
			continue;	}
		if(stack.isEmpty())
				return false;
			char check;
			switch(x)		
	{
			case ')':
				check=stack.pop();
		if(check=='{'|| check=='[')
			return false;
			break;
			case '}':
				check=stack.pop();
		if(check=='('||check=='[')
			return false;
			break;
			case ']':
				check=stack.pop();
		if(check=='('||check=='{')
			return false;
			break;
	}
	}
//			check Empty Stack
		return (stack.isEmpty());
	}
	}