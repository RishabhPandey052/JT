package casestudy.framework;

public interface BankFactory {
	
	public SavingAcc getNewSavingAccount(int accNo, String accNm, Float accBal,boolean isSalaried);
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, Float accBal,float creditLimit);
}
