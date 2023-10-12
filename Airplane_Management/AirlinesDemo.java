import java.util.Scanner;
class AirlinesDemo{
	public static void main(String args[]){	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter data size :");
		AirlinesManagement am=new AirlinesManagement(scan.nextInt());
		int opt,op;
		int pno=1;
		int pid,p;
		do{
			System.out.println("MENU\n1.ADD details\n2.Search Passenger\n3.Display Passenger\nEnter option :");
			op=scan.nextInt();
			switch(op){
				case 1: System.out.println("Enter name,id,flight no.,source and dest :");
					am.addDetail(pno,new Airlines(scan.next(),scan.nextInt(),scan.nextInt(),scan.next(),scan.next()));
					pno++;
					break;
				case 2: System.out.println("Enter passenger id");
					pid=scan.nextInt();
					if(am.searchPassenger(pid))
						System.out.println("Found");
					else
						System.out.println("Not found");
					break;
				case 3: System.out.println("Enter passenger number");
					p=scan.nextInt();
					am.displayPassenger(p);
					break;
				default: System.out.println("invalid option");
			}
			System.out.println("Do you want to continue? (1/0)");
			op=scan.nextInt();
		}while(op==1);
	}
}