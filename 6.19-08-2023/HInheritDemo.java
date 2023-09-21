//Dynamic Method dispatch or runtime polymorphism//
/*
runtime polymorphism(function call is binded during runtime) is done by function overriding
static polymorphism(function call is binded static/during compile time) is achieved by function overloading
here we discuss about hierarchial inheritance and overriding
base class reference is compatible with derived class object but reverse aint true

reference : 
consider statements
Rectangle r;               //reference to class Rectangle not an object, cant access yet
r=new Rectangle(10.0,20.0); // now object is complete

keyword abstract- defn to be given by derived class dev later- not going to define for base class.
Overriding is mandatory =>inheritance is mandatory !!!!. Also function and class can only be abstract, data members can't be.
if final is there in method- overriding shouldnt be there !! major difference.
Base class reference cannot access newly added derived class functions...only overriden functions in member class is accessible
*/
//==========================================================================================================//
import java.util.Scanner;
abstract class Shape{
	double dim1,dim2;
	Shape(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	abstract double area(); //to avoid defining the base class function which is seldom invoked- here we need not give any defn//
	/*double area(){
		System.out.println("Undefined");
		return -1;
	}*/
}
class Rectangle extends Shape{
	Rectangle(double length,double width){
		super(length,width);
	}
	double area(){
		System.out.println("Area of Rectangle");
		return dim1*dim2;
	}
}
class Triangle extends Shape{
	Triangle(double base,double height){
		super(base,height);
	}
	double area(){
		System.out.println("Area of Triangle");
		return dim1*dim2/2;

	}
}
class HInheritDemo{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		Rectangle r=new Rectangle(10.0,20.0);
		Triangle t=new Triangle(10.0,20.0);
		System.out.println(""+r.area());
		System.out.println(""+t.area());	
		//now trying the reference-object compatibility here//
		int ch=scan.nextInt();
		Shape s;
		switch(ch){
			case 1:{
				s=new Rectangle(10.0,20.0);       //shape reference is initialised with rectangle 
				System.out.println(""+s.area());
				break;
			}
			case 2:{
				s=new Triangle(10.0,20.0);       //shape reference is initialised with triangle
				System.out.println(""+s.area());
				break;
			}
			default:System.out.println("Invalid choice");
		}  //the function to be binded with this function call being decided at runtime is called dynamic polymorphism//
		

	}
}