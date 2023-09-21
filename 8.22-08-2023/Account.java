//JACK PACKAGE:) ITS PRONOUNCED PACKAUGE
/*keywords
package - create package
import - to use package in any other scenario or folder
syntax to specify containership relationship
package pkg1;
or package pk1.pk2; //inner container pk2 is also created and opened
while compiling use javac -d <path(default= current working directory)> file_name.java
*/
package mypack;
public class Account{
	String name;
	double balance;
	public Account(String name,double balance){
		this.name=name;
		this.balance=balance;
	}
	public String toString(){
		return ""+name+"\t"+balance;
	}
}