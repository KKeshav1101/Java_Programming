//Program for Exception Handling(Keshav)
class BadOperatorException extends Exception{
	char opr;
	BadOperatorException(String msg,char op){
		super(msg);
		opr=op;
	}
	public String toString(){
		return "BadOperatorException: "+super.getMessage()+" because of operator "+opr;
	}
}
