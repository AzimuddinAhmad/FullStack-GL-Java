//	@@ -0,0  +1,12@@
package com.greatlearning.service;

public class OTPGenerator {
	public int otpGenerated ()    {
		int randomotp = (int) (Math.random () * 9000) + 1000;
		return randomotp;
		
	}
	
	
}
