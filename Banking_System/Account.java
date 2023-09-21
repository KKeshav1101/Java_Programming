//account class defn
class Account{
	protected int accnumber;
	protected double balance;
	Account(){
		accnumber=0;
		balance=0.0;
	}
	Account(int accno,double bal){
		accnumber=accno;
		balance=bal;
	}
	public String toString(){
		return "Account number :"+accnumber+"\nBalance :"+balance;
	}
	void display(){
		System.out.println("Account number :"+accnumber+"\nBalance :"+balance);
	}
}