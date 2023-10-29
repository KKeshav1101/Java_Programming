import java.util.*;
class Student{
	int rno;
	String name;
	Student(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
	public String toString(){
		return rno+","+name;
	}
}
class MyComp implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return (s1.name).compareTo(s2.name);
	}
}
class MyCompReg implements Comparator<Student>{
	public int compare(Student s1,Student s2)
		return s1.rno-s2.rno;
}
class Test{
	public static void main(String args[]){
		MyCompReg obj=new MyCompReg();
		TreeSet<Student> al=new TreeSet<Student>(new MyCompReg());     //or MyComp or reverse
		al.add(new Student(3030,"Alice Paul"));
		al.add(new Student(3001,"Bob Mark"));
		al.add(new Student(3025,"DARTH Paul"));
		System.out.println(al);
	}
}