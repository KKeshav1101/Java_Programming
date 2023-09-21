class NegativeBalanceException extends Exception{ 
	double balance;
	NegativeBalanceException(String msg,double b){
		super(msg);
		balance=b;
	}
	public String toString(){
		return "NegativeBalanceException:"+this.getMessage()+"\tBalance="+balance;
	}
}