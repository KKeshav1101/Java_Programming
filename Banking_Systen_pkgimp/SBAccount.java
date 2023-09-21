package pkaccount.sb;
import pkaccount.Account;
public class SBAccount extends Account{
	public SBAccount(int accno,double bal){
		super(accno,bal);
	}
	public void deposit(double amount){
		balance=balance+amount;
		System.out.println("Amount of Rs."+amount+" was deposited successfully !"+"\nBalance="+balance);
	}
	public void withdraw(double amount){
		if(amount>balance){
			System.out.println("Cannot Withdraw. Insufficient balance in SBAccount");
		}
		else{
			balance=balance-amount;
			System.out.println("Amount of Rs."+amount+" was withdrawn successfully !"+"\nBalance="+balance);
		}
	}
	public double calc_interest(){
		return balance*4/100;
	}
}
