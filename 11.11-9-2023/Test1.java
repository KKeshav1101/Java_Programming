class Test1{
	static void code()throws Exception{ //func should handle
		int a=0;
		int b=45/a;
		Thread.sleep(10);
		System.out.println(""+b);
	}
	public static void main(String args[]) throws Exception{ //jvm should also handle
		code();
	}
}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test1.code(Test1.java:4)
        at Test1.main(Test1.java:9)*/