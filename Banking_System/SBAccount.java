//SBAccount
class SBAccount extends Account{
	SBAccount(int accno,double bal){
		super(accno,bal);
	}
	void deposit(double amount){
		balance=balance+amount;
		System.out.println("Amount of Rs."+amount+" was deposited successfully !"+"\n Balance="+balance);
	}
	void withdraw(double amount){
		balance=balance-amount;
		System.out.println("Amount of Rs."+amount+" was withdrawn successfully !"+"\nBalance="+balance);
	}
	double calc_interest(){
		return balance*7/100;
	}
}