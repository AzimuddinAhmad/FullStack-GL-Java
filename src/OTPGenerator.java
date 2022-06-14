//	@@ -0,0  +1,12@@


public class OTPGenerator {
	public int otpGenerated ()    {
		int randomotp = (int) (Math.random () * 9000) + 1000;
		return randomotp;
		
	}
	
	
}
