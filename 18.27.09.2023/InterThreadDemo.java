class Q{
    int n;
    boolean flag=true;
    synchronized int get(){
        try{
        while(flag)
            wait();
        System.out.println("get.."+n);
        flag=true;
        notify();
        }catch(Exception e){}
        return n;
    }
    synchronized void put(int n){
        try{
        while(!flag)
            wait();
        this.n=n;
        System.out.println("put.."+n);
        flag=false;
        notify();
        }catch(Exception e){}
    }
}
class Producer implements Runnable{
    Q q;
    Thread t;
    Producer(Q q){
        this.q=q;
        t=new Thread(this,"Producer");
    }
    public void run(){
        int i=0;
        while(true){
            q.put(i++);
        }
    }
}
class Consumer implements Runnable{
    Q q;
    Thread t;
    Consumer(Q q){
        this.q=q;
        t=new Thread(this,"Producer");
    }
    public void run(){
        while(true){
            q.get();
        }
    }
}
class InterThreadDemo{
    public static void main(String args[]){
        Q q=new Q();
        Producer p=new Producer(q);
        Consumer c=new Consumer(q);
        p.t.start();
        c.t.start();
    }
}

//without wait and notify, all that is put isnt being get in the infinite loop
/*
put..1
get..1
put..2
get..2
put..3
get..3
put..4
get..4
put..5
get..5
put..6
get..6
put..7
this will be the first few desired outputs.
 */