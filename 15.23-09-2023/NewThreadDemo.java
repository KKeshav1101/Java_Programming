//Thread using Runnable interface
/*Runnable interface has only one method
public void run()
*/
class NewThread1 implements Runnable{ //1.implement runnable interface
	Thread t; //2.Thread reference
	NewThread1(String name){
		t=new Thread(this,name); //3.Thread object
		t.start();
	}
	public void run(){ //4.Executable unit, should be an independent
		try{
			for(int i=0;i<5;i++){
				System.out.println(t.getName()+"\ti="+i+"\t"+t.getState());
				Thread.sleep(800);
			}
		}catch(InterruptedException e){
			System.out.println("caught..."+e);
		}
	}
}
class NewThreadDemo{
	public static void main(String args[]){
		NewThread1 t1=new NewThread1("FirstThread");
		System.out.println(t1.t.getName()+"\t"+t1.t.getState());
		NewThread1 t2=new NewThread1("Second Thread");
		System.out.println(t2.t.getName()+"\t"+t2.t.getState());
		NewThread1 t3=new NewThread1("Third Thread");
		System.out.println(t3.t.getName()+"\t"+t3.t.getState());
	}
}


/* 
 getName(),setName(String)
 getState(),setState()
 getPriority(),setPriority(int)
 */