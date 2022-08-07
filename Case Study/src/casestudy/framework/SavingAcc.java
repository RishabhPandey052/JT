package casestudy.framework;

public abstract class SavingAcc extends BankAcc{

	public SavingAcc(int accNo, String accNm, Float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	private  boolean isSalaried;
	private static final float MINBAL = 1000;
	
	public boolean isSalaried() {
		return isSalaried;
	}
	public static float getMinbal() {
		return MINBAL;
	}
	
	@Override
	public  void withdraw(float amount) {
		if(this.getAccBal() < SavingAcc.getMinbal()) {
			return;
		} else {
			this.setAccBal(this.getAccBal() - amount);
		}
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]"+ "[MinBal = "+ MINBAL+"]" + super.toString();
	}
	
	
	

}
