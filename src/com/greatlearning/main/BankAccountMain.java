package com.greatlearning.main;
import com.greatlearning.model.Customer;
import com.greatlearning.service.Banking;
import java.util.Scanner;

public class BankAccountMain {
		public static void main(String[]args) {
			String bankAccountNo;
			String password;
			
		Customer cus = new Customer ("2345656" , "passwprd");
		Banking banking = new Banking();
		Scanner sc = new Scanner(System.in);
			System.out.println("Entet your Account No   : ");
		bankAccountNo  = sc.nextLine();
		System.out.println("Please enter password");
		password = sc.nextLine();
				
	if (cus.getBankAccountNo (). equals(bankAccountNo) && cus.getPassword (). equals (password)) {
		System.out.println("Welcome to Canara Bank");
		
		int options;
		do 
		{
			System.out.println (" Please select your banking option");
			System.out.println (" *********************************");
			System.out.println("1.	Depsite");
			System.out.println("2.	Withdrawal");
			System.out.println("3.	Transfer");
			System.out.println("0.	Log out");
			
			options = sc.nextInt();		// 0
			switch (options) {
			case 0:  
				
							//	options = 0;
				break ;
					
			case 1:	{
			
			banking.deposit ();    }    
			
		break;
		case 2:    {    
			
			banking.withdrawl ();  }
		break;
		case 3:  {
			banking.transter();    }
		break;
		default:
		System.out.println("Invalid key entered   : ");  }
	}
	while (options != 0) ;		{
		System.out.println("Exited successfully");		}

}	else	{
		System.out.println("Invalid Credentials");
			}
			}

			}

