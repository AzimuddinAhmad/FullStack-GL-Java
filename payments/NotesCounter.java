package com.gl.payments;
public class NotesCounter 															{
		public static void notesCountImplementation(int currency[],int amount)		{
				int [] noteCounter =new int[currency.length];
				try 	{
				for(int i=0;i<currency.length;i++)									{
				if(amount>=currency[i])												{
						noteCounter[i]=amount/currency[i];
						amount =amount-noteCounter[i]*currency[i];					}			
																					}
				if(amount>0)														{
					System.out.println("Given Denomination value is higher : ");	}
				else																{
						System.out.println("Payment is above the order : ");			}
				for(int i=0;i<currency.length;i++)									{
					if (noteCounter[i]!=0)											{
						System.out.println(currency[i]+ " : "+noteCounter[i]);		}
																					}
																					}
			catch(Exception ex)														{
				System.out.println("Exception " + ex);								
		}
	}
}