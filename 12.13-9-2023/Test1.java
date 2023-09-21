//TESTING THROWS
import java.io.*;
class Test1{
	static void cal()throws Exception{
		int a=0;
		int b=45/a;
		Thread.sleep(100); //InterruptedException
		DataInputStream in=new DataInputStream(System.in);
		int x=in.readInt(); //IOException
	}
	public static void main(String args[])throws Exception{
		try{
			cal();
		}catch(Exception e){
			System.out.println(""+e);
		}
	}
}
/*
OUTPUT
-------------------------------------
java.lang.ArithmeticException: / by zero
*/