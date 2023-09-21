//BadOperandException
class BadOperandException extends Exception{
	int op;
	BadOperandException(String msg,int op){
		super(msg);
		this.op=op;
	}
	public String toString(){
		return "BadOperandException: "+super.getMessage()+" due to operand "+op;
	}
}