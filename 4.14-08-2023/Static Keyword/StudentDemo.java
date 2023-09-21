an/*static and final keywords
They are access modifiers in java
static data members and static member functions or even static classes and static blocks are possible
if anything is defined with the static keyword- its common to the entire class-example- no of tickets available for different accounts online
must be inititalised before the first object creation
number of objects under a certain class can also be tracked in java with the help of a static counter data member*/
//============================================================================================================================================//
//(student.java)//
class Student{
	int rno;
	private static int count;  		//can only initialise if assigned a value here
	String name;
	Student(int rno,String name){
		this.rno=rno;
		this.name=name;
		count++;
	}
	public String toString(){
		return "rollno :"+rno+" Name :"+name;	
	}
	static int getcount(){
						//if count were a private data member- then the static function is used to access and maybe modify the static datamember as well//
		return count;
	}	
	static{    				//static block is used to initialise or update the static data member- becuz u cant update it otherwise- can only initialise outside. also 						shouldnt initialise normal members// //static block is executed before the creation of the object//
		System.out.println("Static block");
		count=0;
	}
}
class StudentDemo{
	public static void main(String args[]){
		Student s1=new Student(3001,"Kesh");
		Student s2=new Student(3002,"Lovelace");
		System.out.println("Student Details\n"+s1+"\n"+s2);
		System.out.println("Created..."+s1.getcount());
	}
}
//for static classes it is necessary to have a nested class and only the nested class can be declared to be static