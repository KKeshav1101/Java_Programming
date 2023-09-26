class Callme{
    synchronized void call(String msg){  //synchronised method
        try{
            System.out.print("["+msg);
            System.out.println("]");
            Thread.sleep(1000);
        }catch(Exception e){}    
    }
}
class Caller implements Runnable{
    String msg;
    Callme targ;
    Thread t;
    Caller(Callme targ,String msg){
        this.targ=targ;
        this.msg=msg;
        t=new Thread(this);
    }
    public void run(){
            targ.call(msg);
    }
}
class SynDemo1{
    public static void main(String args[]){
        Callme cr=new Callme();                       //common resource  cr
        Caller t1=new Caller(cr,"Welcome to");
        Caller t2=new Caller(cr,"SASTRA");
        Caller t3=new Caller(cr,"Deemed University");
        t1.t.start();
        t2.t.start();
        t3.t.start();
    }
}
