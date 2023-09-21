//OperationFailedException
class OperationFailedException extends Exception{
	String des;
	OperationFailedException(String msg,String des){
		super(msg);
		this.des=des;
	}
	public String toString(){
		return "OperationFailedException: "+this.getMessage();
	}
}