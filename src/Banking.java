//		@@ -0,0  +1,89 @@



import java.util.Scanner;

import com.greatlearning.service.OTPGenerator;

public class Banking {

		Scanner sc = new Scanner (System.in);
		OTPGenerator otpG = new OTPGenerator();
		int balance = 1000;
public void deposit ()  {
		int amount ;
System.out.println("Enter the amount to be deposited");
	amount = sc.nextInt();
if (amount > 0)     {
	balance = balance + amount;
System.out.println("Total balance amount"  + balance);
}
else
{
System.out.println("Enter the correct amount : ");
}
}
public void withdrawl ()   {
	
		int amount;
	System.out.println("Enter the amount to be withdrawl");
		amount = sc.nextInt();
if (amount > 0 && balance - amount >= 0) {  // Balance = 1000 amount = 1500 1000- (-500) = -500
	balance = balance - amount;
		System.out.println("Balance amount"    +balance);
		System.out.println("Amount withdrawl successfully");
	}    else    {
		System.out.println("Insufficient balance");
}
}
public void transter ()   {
	int amount, otp, otpgenerated, bankAcctNo;
		otpgenerated = otpG.otpGenerated ();
		System.out.println("Enter the OTP:  ");
		otp = sc.nextInt ();
if (otp == otpgenerated)   {
	System.out.println("Enter the amount to be transferred and Account number");
	amount = sc.nextInt ();
	bankAcctNo = sc.nextInt();
if (balance - amount > 0)  {
	System.out.println("Amount"  +amount  + "Transferred successfully");
	balance = balance - amount;
	System.out.println("Balance"   +balance);
}    else    {
	System.out.println("Transferred failed:  ");	}
}	else	{
	System.out.println("Invalid otp");  
}
}
}
