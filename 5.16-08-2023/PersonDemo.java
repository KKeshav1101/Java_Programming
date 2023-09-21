/*create a class called person with name and address, created extended class student-rno and degree, person-name and nation as datamembers. Create an object for student by invoking no arg,parametrized and copy constructor*/
class Person{
 	String name;
	String nation;
	Person(){
		name="\0";
		nation="\0";	
	}
	Person(String name,String nation){
		this.name=name;
		this.nation=nation;
	}	
	Person(Person p){
		this.name=p.name;
		this.nation=p.nation; 
	}
	public String toString(){
		return "Person"+"\nName :"+name+"\nNationality :"+nation;
	}
} 
class Student extends Person{
	int rollno;
	String degree;
	Student(){
		rollno=0;
		degree="\0";
	}
	Student(String name,String nation,int rno,String degree){
		super(name,nation);
		rollno=rno;
		this.degree=degree;
	}
	Student(Student s){
		super(s.name,s.nation);
		this.rollno=s.rollno;
		this.degree=s.degree;
	}
	public String toString(){
		return "Student details :"+"\nName :"+name+"\nNationality :"+nation+"\nRoll number :"+rollno+"\nDegree :"+degree;
	}
}
class PersonDemo{
	public static void main(String args[]){
		Student s1=new Student("Keshav","Indian",11,"B.Tech. CSE");
		System.out.println("Student details (parametrized)"+s1);
		Student s2=new Student();
		System.out.println("Student Details (no argument):"+s2);
		Student s3=new Student(s1);
		System.out.println("Student Details (copy of s1):"+s3);
	}	
}