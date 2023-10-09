//binary files
import java.io.*;
class Student implements Serializable{ //to make it possible to store in permanent memory
	int rno;
	String name;
	Student(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
	public String toString(){
		return ""+rno+"\t"+name;
	}
}
class BFDemo{
	public static void main(String args[])throws Exception{
		FileOutputStream fout=new FileOutputStream("student.dat");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		Student s=new Student(3001,"XXXX");
		out.writeObject(s);
		Student s1=new Student(3002,"YYYY");
		out.writeObject(s1);
		out.close();
		fout.close();	
	}
}