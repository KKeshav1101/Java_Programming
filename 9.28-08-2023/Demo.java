interface Inter1{
	int x=11;
	void callme();
	default void dontcallme(){
		System.out.println("BYE");
	//static void test();  //wrong because static abstract combo is illegal
	}
}
class InterClass1 implements Inter1{
	static final int y=20;
	public void callme(){
		System.out.println("Interclass 1...callme().."+x);
	}
}
class InterClass2 implements Inter1{
	public void callme(){
		System.out.println("Interclass 2...callme().."+x);
	}
}
class Demo{
	public static void main(String args[]){
		System.out.println("Inter1 static data member :"+x);
		InterClass1 ic1=new InterClass1();
		InterClass2 ic2=new InterClass2();
		ic1.callme();
		ic2.callme();		
	}
}