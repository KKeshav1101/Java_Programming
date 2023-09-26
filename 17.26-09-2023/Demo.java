class Account{
    int acno;
    double balance;
    Account(int acno,double balance){
        this.acno=acno;
        this.balance=balance;
    }
    public String toString(){
        return "Account number :"+acno+"\nBalance :"+balance;
    }
    synchronized void deposit(double amount){
        double t=balance;
        t=t+amount;
        balance=t;
        System.out.println(this); //prints current object
    }
    synchronized void withdraw(double amount){
        double t=balance;
        t=t-amount;
        balance=t;
        System.out.println(this);
    }
}
class AccountDemo implements Runnable{
    Account a;
    Thread t;
    int choice;
    AccountDemo(Account a,int choice){
        this.a=a;
        t=new Thread(this);
        this.choice=choice;
    }
    public void run(){
        synchronized(a){
            if(choice==1){
                System.out.println("Deposit");
                a.deposit(1000);
            }    
            else{
                System.out.println("Withdraw");
                a.withdraw(500);
            }    
        } 
    }
}
class Demo{
    public static void main(String args[]){
        Account cr=new Account(11,5000);
        AccountDemo t1=new AccountDemo(cr,1);
        AccountDemo t2=new AccountDemo(cr,2);
        t1.t.start();
        t2.t.start();
    }
}

/*
without sync..... 
Withdraw
Account number :11
Balance :6000.0
Account number :11
Balance :5500.0
Deposit
with sync.....(block and method)
Deposit
Account number :11
Balance :6000.0
Withdraw
Account number :11
Balance :5500.0
*/