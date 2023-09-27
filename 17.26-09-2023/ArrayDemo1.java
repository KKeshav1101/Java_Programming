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
    void add(){
        for(int i=0;i<10;i++){
            try{
                arr[i]=arr[i]+10;
                System.out.println("ADD UPDATE :"+arr[i]);
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
    void subtract(){
        for(int i=0;i<10;i++){
            try{
                arr[i]=arr[i]-20;
                System.out.println("SUB UPDATE :"+arr[i]);
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}
class Thread1 implements Runnable{
    Array a;
    Thread t;
    int choice;
    Thread1(Array a, int choice){
        this.a=a;
        this.choice=choice;
        t=new Thread(this);
    }
    public void run(){
        if(choice==1){
            System.out.println("IN ADD :");
            a.add();
        }
        else{
            System.out.println("IN SUB :");
            a.subtract();   
        }
    }
}

class ArrayDemo1 {
    public static void main(String args[]){
        int[] list={1,3,5,2,11,8,7,6,12,17};
        Array comres=new Array(list);
        System.out.println("Inital Array"+comres);
        Thread1 addThread1=new Thread1(comres,1);
        Thread1 subThread1=new Thread1(comres,2);
        addThread1.t.start();
        subThread1.t.start();
    }    
}
