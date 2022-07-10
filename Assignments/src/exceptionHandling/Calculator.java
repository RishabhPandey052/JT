package exceptionHandling;

public class Calculator {
	
	long calcPower(int n,int p) throws Exception{
		
		long ans = 1;
		
		if(n == 0 && p == 0) {
			throw new Exception("n and p should not be zero ");
		}
		
		else if(n < 0 || p < 0) {
			throw new Exception("n or p can't be less than zero");
		}
		
		
		for(int i = 1;i<=p;i++) {
			ans = ans * n ;
		}
		
		return (long)ans;
	}

}
