//TESTING THROW
class Test{
	public static void main(String args[]){
		try{
			throw new NullPointerException("null pointer");
		}catch(NullPointerException e){
			System.out.println(""+e);
		}
	}
}
/*
OUTPUT
java.lang.NullPointerException: null pointer
*/