import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class MyRandom implements Runnable{
    Thread t;
    MyRandom(){
        t=new Thread(this,"Random");
    }
    public void run(){
        Random r=new Random();
        while(true){
            System.out.println(t.getName()+"\t"+r.nextInt(1000));
            try{                                    //dont use sleep in GUI applications
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}
class Time implements Runnable{
    Thread t;
    Time(){
        t=new Thread(this,"Time");
    }
    public void run(){
        DateTimeFormatter d=DateTimeFormatter.ofPattern("yyyy/MM/dd,HH:mm:ss");
        while(true){
            System.out.println(t.getName()+"\t"+d.format(LocalDateTime.now()));
            try{                                    //dont use sleep in GUI applications
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}
class Demo{
    public static void main(String args[]){
        MyRandom t1=new MyRandom();
        Time t2=new Time();
        t1.t.start();
        //t1.t.stop();
        //t1.t.suspend();
        System.out.println(t1.t.getName()+"\t"+t1.t.getState()+"\t"+t1.t.isAlive());  //isAlive would return false if stop is used.
        //t1.t.resume();  //compliments suspend  but not stop
        try{
            t1.t.join();   //throws interrupted exception
        }catch(Exception e){}
         System.out.println(t1.t.getName()+"\t"+t1.t.getState());
        t2.t.start();
    }
}
/* Sample output
Random  31
Time    2023/10/03,11:38:42
Random  633
Time    2023/10/03,11:38:43
Random  548
Time    2023/10/03,11:38:44
Random  136
Time    2023/10/03,11:38:45
Random  797
Time    2023/10/03,11:38:46
Random  534
Time    2023/10/03,11:38:47
Random  437
Time    2023/10/03,11:38:48
Random  679
Time    2023/10/03,11:38:49
Random  179
Time    2023/10/03,11:38:50
 */