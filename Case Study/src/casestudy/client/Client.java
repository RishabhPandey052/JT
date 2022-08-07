package casestudy.client;

import  casestudy.application.MMBankFactory;
import  casestudy.application.MMCurrentAcc;
import  casestudy.application.MMSavingAcc;

public class Client {
	
	public static void main(String[] args) {
		MMBankFactory fc = new MMBankFactory();
	
		
		MMSavingAcc sA =  fc.getNewSavingAccount(2, "Person2", 1000.0f , true);
		MMCurrentAcc cA = fc.getNewCurrentAccount(1, "Person1", 1000.0f, 500);
		

		sA.withdraw(40);
		System.out.println("Withdrawal in saving Acc" + sA.getAccBal());
		
		cA.withdraw(5000);
		System.out.println("Withdrawal(Current Acc) greater amount than balance "+ cA.getAccBal());
		
		cA.withdraw(100);
		System.out.println("Withdrawal in currnet Acc" + cA.getAccBal());
		
		System.out.println("To string of Saving Acc");
		System.out.println(sA);
		
		System.out.println("To string of Current Acc");
		System.out.println(cA);
	}

}

