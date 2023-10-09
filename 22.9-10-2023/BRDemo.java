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
class BRDemo{
	public static void main(String args[])throws Exception{
		FileInputStream fout=new FileInputStream("student.dat");
		ObjectInputStream out=new ObjectInputStream(fout);
		Student s;
		try{
		while(true){
			s=(Student)out.readObject();
			System.out.println(s);
		}
		}catch(Exception e){System.out.println("EOF");}
		out.close();
		fout.close();	
	}
}