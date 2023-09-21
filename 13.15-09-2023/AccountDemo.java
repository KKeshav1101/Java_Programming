class Account{
	int accno;
	double balance;
	Account(int accno,double balance){
		this.accno=accno;
		this.balance=balance;
	}
	void deposit(double amt){
		balance+=amt;
	}
	void withdraw(double amt){
		try{
			if(balance<0)
				throw new NegativeBalanceException("Negative balance",balance);
			else{
				try{
					balance-=amt;
					if(balance<0){
						InvalidTransactionException e=new InvalidTransactionException("\nInvalid Withdrawal :",balance);
						balance+=amt;
						e.initCause(new NegativeBalanceException("Negative balance",balance));
						throw e;
					}
				}catch(InvalidTransactionException e){
					System.out.println("Caught..."+e);
					e.getCause();
				}
			}
		}catch(NegativeBalanceException e){
			System.out.println("Caught..."+e);
		}
	}
	public String toString(){
		return ""+accno+"\nBalance="+balance;
	}
}
class AccountDemo{
	public static void main(String args[]){
		Account a=new Account(0001,1500);
		System.out.println(""+a);
		a.withdraw(3500);
		System.out.println(""+a);
	}
}