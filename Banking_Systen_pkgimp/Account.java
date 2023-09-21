//package implementation using banking system simulation//
package pkaccount;
public class Account{
	protected int accnumber;
	protected double balance;
	public Account(){
		accnumber=0;
		balance=500.0;
	}
	public Account(int acno,double balance){
		accnumber=acno;
		this.balance=balance;
	}
	public String toString(){
		return "\nAccount number :"+accnumber+"\nBalance :"+balance;
	}
}
