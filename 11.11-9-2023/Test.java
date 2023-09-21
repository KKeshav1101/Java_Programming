class Test{
	public static void main(String args[])throws Exception{  //added throws exception to report to jvm to handle it otherwise jvm wont take care of the InterruptedException//
		int a=0;
		int b=45/a;
		Thread.sleep(10);    //make processor sleep for 10ms//

/*
Test.java:5: error: unreported exception InterruptedException; must be caught or declared to be thrown
                Thread.sleep(10);    //make processor sleep for 10ms//
                            ^
1 error
*/

		System.out.println(""+b);
	}
}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:4)*/