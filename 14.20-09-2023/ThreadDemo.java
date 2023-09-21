class ThreadDemo{
	public static void main(String args[]){
		Thread t=Thread.currentThread(); //acquiring info about currently running thread
		try{
		for(int i=0;i<=5;i++){
			System.out.println(t.getName()+"i="+i);
			Thread.sleep(5000);
		}
		}catch(InterruptedException e){
			System.out.println("Caught.."+e);
		}
	}
}


/*
java.lang.Thread
currentThread()//static
sleep()//static
getName(),setName(String) //nonstatic
getPriority(),setPriority(int) //nonstatic
*/