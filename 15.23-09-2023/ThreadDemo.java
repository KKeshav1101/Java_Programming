//Thread using Runnable interface
class NewThread1 implements Runnable //1. implement runnable 
{
	Thread t; //2.Thread reference
	NewThread1(String name){
		t=new Thread(this, name);//3.thread obj
		t.start();
	}
	public void run(){//4.Exe unit
	try{
		for(int i=0;i<5;i++){
			System.out.println(t.getName()+"\ti="+i);
			Thread.sleep(1000);
		}
	}catch(InterruptedException e){}	
	}
}
class ThreadDemo1{
	public static void main(String args[])throws Exception{
		Thread t=Thread.currentThread();
		NewThread1 t1=new NewThread1("FirstThread");

		NewThread1 t2=new NewThread1("SecondThread");
			
		System.out.println(t.getName()+"\t"+t.getState());
		System.out.println(t1.t.getName()+"\t"+t1.t.getState());
		System.out.println(t2.t.getName()+"\t"+t2.t.getState());
		System.out.println(t1.t.getName()+"\t"+t1.t.getState());
		System.out.println(t.getName()+"\t"+t.getState());
	}
}

/*
getName(), setName(String)
getState(), setState()
getPriority(),setPriority(int);
*/
