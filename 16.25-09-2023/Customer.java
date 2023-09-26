class Customer{
    int cusid;
    String name;
    int accno;
    int balance;
    Customer(int cusid,String name,int accno,int balance){
        this.cusid=cusid;
        this.name=name;
        this.accno=accno;
        this.balance=balance;
    }
    public String toString(){
        return ""+cusid+"\n"+name+"\n"+accno+"\n"+balance;
    }
    public void deposit(int amount){
        new Thread(){
            public void run(){
                try{
                    balance=balance+amount;
                    System.out.println("Balance ="+balance);
                }catch(Exception e){}
            }    
        }.start();
    }
    public void withdraw(int amount){
        new Thread(){
            public void run(){
                if(amount>balance)
                    System.out.println("Cannot withdraw, Insufficient balance");
                else{
                    balance-=amount;
                    System.out.println("Balance ="+balance);
                }
            }
        }.start();    
    }
}
