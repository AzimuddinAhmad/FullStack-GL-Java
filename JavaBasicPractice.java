/*    Q  1.
		Write a program to get the following output.
		Hey there,
		I am data!    */
public class JavaBasicPractice {
	public static void main (String []args) {
			System.out.print("It is answer of 1. question : \n");
			System.out.println("-----------------------------");
					String hi = "Hey there,";
		System.out.println(hi   + "\nI am Data!\n");
/*  Q   2.   Write a program to print as below
		*
		**
		***
		****				on screen   */
		
			System.out.print("It is answer of 2. question :\n");
			System.out.println("-----------------------------\n");
		System.out.println ("  *  \n  **  \n  ***  \n  **** \n"  );
/*  Q	3.    Print the following pattern on the screen as below
 		*****
 		 *** 
 		  *  
 		 *** 
 		*****						 */
		System.out.print("It is answer of 3. question :\n");
		System.out.println("-----------------------------\n");	
		System.out.println("   *****\n    ***\n     *\n    ***\n   *****\n");

//	Q	4.	Write a program to print the sum of the numbers 2, 4 and 5.
			int num1 = 2;	int num2 = 4;	int num3 = 5;	int sum  = 0;
			sum = num1 + num2 + num3;
			System.out.print("It is answer of 4. question :\n");
			System.out.println("-----------------------------");		
	System.out.println(sum);
	System.out.println();

//  Q 	5.   Write a program to print the difference and product of the numbers 45 and 32. 

		int x = 45;				int y = 32;
		String z = "     <----Difference between 45 and 32 is :";
		String zz = "   <----Multiplication of both numbers  :"; 
		System.out.print("It is answer of 5. question :\n");
			System.out.println("-----------------------------");	
	System.out.println(x - y  +z);
	System.out.println(x * y +zz); 
	System.out.println();
	
//  Q   6.	Write a Java program to print an int, a double and a char on screen. 
		
		int Integer = 10203040;		double Double = 102030.199d;		char Character = 'A';
			System.out.print("It is answer of 6. question :\n");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
System.out.println("Integer Value-------> " +Integer +"\nDouble--------------> " +Double +"\nCharacter-----------> " +Character);	
	
//  Q	7.	Write a program to print the area of a rectangle of sides 2 and 3 units respectively.
		
			int  rect = 2 * 3;
			System.out.println();
			System.out.print("It is answer of 7. question :\n");
			System.out.println("-----------------------------");	
	System.out.println("Rectamngle of sides 2 into 3 units--->  " +rect +"\n  ");		
			
//  Q   8.   Write a program to print the product of the numbers 8.2 and 6.	
	
	float product1 = 8.2f;			int product2 = 6;
	System.out.print("It is answer of 8. question :\n");
	System.out.println("-----------------------------");
	System.out.print("Multiplication of Procuct One & Product Two--->   ");
	System.out.println(product1*product2);
	
//  Q   9.	Print the ASCII value of the character 'h'.
	
	byte h = 'h' ; 
	System.out.print("\nIt is answer of 9. question :\n");
	System.out.println("-----------------------------");
	System.out.print("It is ASCII character of h--->   "  +h);
// it also way to print ASCII character of h			System.out.print((int)   'h');	
	
//	Q   10.  Write a program to add 3 to the ASCII value of the character 'D' and print the equivalent character.	
	
	System.out.println("\n\nIt is answer of 10. question :");
	System.out.println("-----------------------------");
		int d = 'D' ;
		int three = 3 ;
		
		System.out.print("It is ASCII value of D (68) and pluse 3    :     ");
		System.out.println(d+three);
//		System.out.println((int)'D'+3);

//  Q  11.  Write a program to assign a value of 100.235 to a double variable and then convert it to int.		
	
		double myDouble = 100.235d;
		int myint = (int) myDouble;
		System.out.println("\nIt is answer of 11. question :");
		System.out.println("-----------------------------");
		System.out.println("It is double data type            :  " +myDouble);
		System.out.println("It is double to int data casting  :  " +myint);
		
//  Q   12.  Write a program to add an integer variable having value 5 and a double variable having value 6.2.		
	
		int val1 = 5 ;		double val2 = 6.2 ; 
		System.out.println("\nIt is answer of 12. question :");
		System.out.println("-----------------------------");
		System.out.print("It is total of 5 and 6.2   =   ");
		System.out.println(val1 + val2) ; 

//  Q   13   Write a program to find the square of the number 3.9.	
		
		float sqr = 3.9f ;
		System.out.println("\nIt is answer of 13. question :");
		System.out.println("-----------------------------");
		System.out.println( "It is sqr of 3.9   = :   "   +sqr *2);

//  Q   14	Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.
	
		int breath = 5 ;	int length = 7 ;
		int sumb = breath + breath ;
		int suml = length + length ; 				
		System.out.println("\nIt is answer of 14. question :");
		System.out.println("-----------------------------");	
		System.out.println("Area of 5 and 7 of rectangle is --->  " + breath * length);
		System.out.println("Premiter of 5 and 7 of rectangle is --->  " + (2*( breath + length)));
//			    System.out.println("Area is "+(5*7)+"\nPerimeter is "+(2*(5+7)));    (It it another way of calculate area and premiter)
		
//  Q   15   Write a program to calculate the perimeter of a triangle having sides of length 2,3 and 5 units.		
			
		float sl = 2.3f ;			int  base = 5 ;  	int sumSlBase = 0;
		sumSlBase = (int) (sl+sl+base) ; 
		System.out.println("\nIt is answer of 15. question :");
		System.out.println("-----------------------------");		
		System.out.println(sumSlBase) ;

//  Q   16   Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
	
		int add = 8;	int mainNo = 2345 ; int sumt = add+mainNo ;  	int div = 3 ;
		System.out.println("\nIt is answer of 16. question :");
		System.out.println("-----------------------------");		
		System.out.println(sumt / div % 5*5) ;	

//   Q  17	Write a program to check if the two numbers 23 and 45 are equal.  
		
		boolean d34 = false ;		boolean d45 = true ;
		System.out.println("\nIt is answer of 17. question :");
		System.out.println("-----------------------------");	
		System.out.println("The value 34 is less than 45 is  : "     +d34+ "  The value 45 is more than 34 is  :  " +d45 ) ; // Another example
		int fals = 34 ;		int tru = 45 ; 
														System.out.println("\nIt is answer of 17. question :");
														System.out.println("-----------------------------");	
														System.out.println(fals==tru); 
//   Q  18	Write a program to print the power of 7 raised to 5. 	
		
		System.out.println("\nIt is answer of 18. question :");
		System.out.println("-----------------------------");
		System.out.print("The power 7 of 5 is : " + 7*7*7*7*7  +"  he power 7of5 as per Math.pow formula : "); System.out.println(Math.pow(7, 5));

//  Q  19	Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.  
	
	
		int a = 55 ; 	int b = 70; 
													System.out.println("\nIt is answer of 19. question :");
													System.out.println("-----------------------------");
		System.out.print("The answer is :     ") ;
		System.out.println(a <50 && a < b);

//  Q  20  Now solve the above question to check if atleast one of the conditions 'a < 50' or 'a < b' is true.
		int aa = 55 ; 	int bb = 70; 
												System.out.println("\nIt is answer of 20. question :");
												System.out.println("-----------------------------");
		System.out.print("The answer is :     ") ;
		System.out.println(aa < 50 || aa < bb) ;
		
//  Q  21  If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.		
		
		int hindi = 78 ; 	int eng = 45 ; 	int math = 62;	int tsum = 0;
		tsum = hindi + eng + math ;
		System.out.println("\nIt is answer of 21. question :");
		System.out.println("-----------------------------");
		System.out.println("Total subject no is :  "+ tsum +"    and % is :   " +(float)tsum/3) ; 

/*  Q  22  Suppose the values of variables 'apple' and 'mango' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
		1 - first program by using a third variable
		2 - second program without using any third variable
		( Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)  
*/
		int apple = 6 ; 	int mango = 8 ;		int banana = 0 ;
		banana = mango; mango = apple ;
		System.out.println("\nIt is answer of 22. question :");
		System.out.println("-----------------------------");
		System.out.println("Banana swap by apple and value is : "  +banana +"  and apple swap to mango value is :  "+mango) ;
		
//  Q  23  Write a program to calculate the sum of the digits of a 3-digit number.           Number : 132        Output : 6
			
		System.out.println("\nIt is answer of 23. question :");
		System.out.println("-----------------------------");
		System.out.println("The total of 3 digits like 132 is  :    " +(1+3+2)); 
		
	
	
	
	}
	}



