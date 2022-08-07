package casestudy.framework;

public abstract class BankAcc {
	
	private int accNo;
	private String accNm;
	private Float accBal;
	
	
	public BankAcc(int accNo, String accNm, Float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.setAccBal(accBal);
	}

	public int getAccNo() {
		return accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public Float getAccBal() {
		return accBal;
	}
	
	

	public abstract void withdraw(float amount);
	public  void deposit(float amount) {
		if(amount > 0) {
			this.setAccBal(this.getAccBal() + amount);
		}
	}

	public void setAccBal(Float accBal) {
		this.accBal = accBal;
	}

	
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	

}
