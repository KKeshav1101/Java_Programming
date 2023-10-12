class PassengerNotFoundException extends Exception{
	String msg;
	PassengerNotFoundException(String msg){
		this.msg=msg;
	}
	public String toString(){
		return "PassengerNotFoundException";
	}
}