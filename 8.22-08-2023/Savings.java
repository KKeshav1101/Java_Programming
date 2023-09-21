package mypack.sav;
import mypack.Account;
public class Savings extends Account{
	public Savings(String name,double balance){
		super(name,balance);
	}
	public String toString(){
		return super.toString();  //super can also call base class functions// and we overloaded toString so this works
	}
}