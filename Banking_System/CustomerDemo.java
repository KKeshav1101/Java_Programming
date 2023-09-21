//Customer class and main 
import java.util.Scanner;
class CustomerDemo{
	public static void main(String args[]){
		Customer[] list=new Customer[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter Customer ID,Account name, address and account number and inital minimum balance :");
			Scanner scan=new Scanner(System.in);
			list[i]=new Customer(scan.nextInt(),scan.next(),scan.next(),scan.nextInt(),scan.nextDouble());
			System.out.println("New Customer Successfully created !");
		}
		int cid,op;	
		System.out.println("\n\nHello Customer, enter customer id :");
		Scanner scan1=new Scanner(System.in);
		cid=scan1.nextInt();
		for(int i=0;i<5;i++){
			if(list[i].cust_id==cid){
				System.out.println("Hello "+list[i].name+"\nEnter 1 to deposit\nEnter 2 to withdraw\nEnter 3 to view Interest\nEnter 4 to diplay details and exit");
				op=scan1.nextInt();
				if(op==1){
					int amount;
					amount=scan1.nextInt();
					list[i].sba.deposit(amount);
				}
				else if(op==2){
					int amount;
					amount=scan1.nextInt();
					list[i].sba.withdraw(amount);
				}
				else if(op==3){
					System.out.println(""+list[i].sba.calc_interest());
				}
				else if(op==4){
					System.out.println("You chose to view details"+list[i].sba+"\nExiting\n");
					break;
				}
				else{
					System.out.println("INVALID CHOICE TRY AGAIN");
					continue;
				}
			}
		}
	}
}