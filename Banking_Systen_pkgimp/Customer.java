package pkcustomer;
import pkaccount.sb.SBAccount;
public class Customer{
	public int cust_id;
	public String name;
	public String address;
	public SBAccount sba;
	public Customer(){
		cust_id=0;
		name="\0";	
		address="\0";
		sba=new SBAccount(0,0.0);
	}
	public Customer(int cid,String name,String address,int accno,double bal){
		cust_id=cid;
		this.name=name;
		this.address=address;
		sba=new SBAccount(accno,bal);
	}
	public String toString(){
		return "\nAccount details\n"+sba+"\nCustomer ID:"+cust_id+"\nName :"+name+"\nAddress :"+address;
	}
}