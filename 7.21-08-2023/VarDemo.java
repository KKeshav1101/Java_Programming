//var, vararg, overloading with var
/* var- for undefined datatype or datatype inference
recall base class reference with derived class object still cant access derived class functions until the functions are overriding functions
*/

class MyClass{
	int x=10;
	int getX(){
		return x;
	}
}
class FirstClass extends MyClass{
	int y=20;
	int getY(){
		return y;
	}
}
class SecondClass extends FirstClass{
	int z=30;
	int getZ(){
		return z;
	}
}
class VarDemo{
	static MyClass getObject(int i){
		switch(i){
			case 1: return new MyClass();
			case 2: return new FirstClass();
			default: return new SecondClass();
	
		}
	}
	public static void main(String args[]){
		var obj=getObject(1);
		System.out.println(""+obj.getX());
		obj=getObject(2);
		System.out.println(""+obj.getX());
		obj=getObject(3);
		System.out.println(""+obj.getX());
	}

}