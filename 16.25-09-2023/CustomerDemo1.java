class  Customer{
	int custID,acno;
	double balance;
	String name;
	Customer(int ac,int cid,double b,String n){
		acno=ac;
		custID=cid;
		balance=b;
		name=n;}
	void deposit(double a){
		balance+=a;
		System.out.println(this);}
	void withdraw(double a){
		balance-=a;
		System.out.println(this);}
	public String toString(){
		return "Customer ID:"+custID+"\tAccount no.:"+acno+"\tName:"+name+"\tBalance:"+balance;}
	}
class NewThread1 implements Runnable 
{	Customer c;
	double amt1,amt2;
	Thread t;
	NewThread1(String name,double a1,double a2,int ac,int cid,double b,String n){
		t=new Thread(this,name);
		amt1=a1;
		amt2=a2;
		c=new Customer(ac,cid,b,n);
		t.start();
	}
	public void run(){
	     try{	
			c.deposit(amt1);
			Thread.sleep(1000);
			
			c.withdraw(amt2);
			Thread.sleep(1000);}
			
		catch(InterruptedException e){}
		}
	
}
class CustomerDemo1{
	public static void main(String args[]){
		NewThread1 t1=new NewThread1("FirstCustomer",3000,2000,100,123,123012,"Hari");
		NewThread1 t2=new NewThread1("SecondCustomer",6000,2500,200,223,123312,"Ajay");
		NewThread1 t3=new NewThread1("ThirdCustomer",3500,2200,300,323,143022,"Harish");
		NewThread1 t4=new NewThread1("FourthCustomer",34000,2300,400,423,523012,"Dan");
		NewThread1 t5=new NewThread1("FifthCustomer",3010,2004,500,523,623012,"Sai");
		System.out.println(""+t1+t2+t3+t4+t5);
		}
	}