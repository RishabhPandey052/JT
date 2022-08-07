package casestudy.application;

import casestudy.framework.BankFactory;

public class MMBankFactory implements BankFactory {

	@Override
	public MMSavingAcc getNewSavingAccount(int accNo, String accNm, Float accBal, boolean isSalaried) {
		MMSavingAcc  sA = new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return sA;
	}

	@Override
	public MMCurrentAcc getNewCurrentAccount(int accNo, String accNm, Float accBal, float creditLimit) {
		MMCurrentAcc cA = new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return cA;
	}

}


