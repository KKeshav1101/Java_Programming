/*
create a class to store integer array of 10 elements
create two different threads.
one thread to add 10 to each element
another thread to subtract 20 from each element
 */
class Array{
    int[] arr=new int[10];
    Array(int list[]){
        for(int i=0;i<10;i++){
            arr[i]=list[i];
        }
    }
    public String toString(){
        return "["+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+","+arr[5]+","+arr[6]+","+arr[7]+","+arr[8]+","+arr[9]+"]";
    }
    synchronized void add(){
        for(int i=0;i<10;i++){
            try{
                arr[i]=arr[i]+10;
                System.out.println("ADD UPDATE :"+arr[i]);
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
    synchronized void subtract(){
        for(int i=0;i<10;i++){
            try{
                arr[i]=arr[i]-20;
                System.out.println("SUB UPDATE :"+arr[i]);
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }

}
class AddThread implements Runnable{
    Array a;
    Thread t;
    AddThread(Array a){
        this.a=a;
        t=new Thread(this);
    }
    public void run(){
        a.add();
    }
}
class SubThread implements Runnable{
    Array a;
    Thread t;
    SubThread(Array a){
        this.a=a;
        t=new Thread(this);
    }
    public void run(){
        a.subtract();
    }
}
class ArrayDemo{
    public static void main(String args[]){
        int[] list={1,3,5,2,11,8,7,6,12,17};
        Array comres=new Array(list);
        System.out.println("Inital Array"+comres);
        AddThread t1=new AddThread(comres);
        SubThread t2=new SubThread(comres);
        t1.t.start();
        t2.t.start();
    }
}