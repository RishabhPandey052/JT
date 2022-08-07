package casestudy.application;
import  casestudy.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, Float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void withdraw(float amount) {
		super.withdraw(amount);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc []" + super.toString();
	}

	

	

	
	

	
	

	

	

}