class InvalidTransactionException extends Exception{
	double balance;
	InvalidTransactionException(String msg,double b){
		super(msg);
		balance=b;
	}
	public String toString(){
		return "InvalidTransactionException"+this.getMessage()+"\tBalance="+balance;
	}
}