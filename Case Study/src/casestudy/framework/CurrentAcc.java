package casestudy.framework;

public abstract class CurrentAcc extends BankAcc {
	
	

	public CurrentAcc(int accNo, String accNm, Float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	private Float creditLimit = null;

	public Float getCreditLimit() {
		return creditLimit;
	}
	
	@Override
	public void withdraw(float amount) {
		if(amount > this.getAccBal() + this.creditLimit) {
			return;
		} else {
			this.setAccBal(this.getAccBal() - amount);
		}
	}
	
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]" + super.toString();
	}
}	
