package casestudy.application;
import  casestudy.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	

	public MMSavingAcc(int accNo, String accNm, Float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}
	
	private static final float MINBAL = SavingAcc.getMinbal();
	
	@Override
	public void withdraw(float amount) {
		super.withdraw(amount);
	}

	@Override
	public String toString() {
		return "MMSavingAcc []" + super.toString();
	}

	public static float getMinbal() {
		return MINBAL;
	}

	

	
	
	
	
	
}
