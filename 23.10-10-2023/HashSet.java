import java.util.*;
class Test1{
	public static void main(String args[]){
		HashSet<String> ar=new HashSet<String>();  //within angular, only class type
		ar.add("Chelsea");
		ar.add("Manchester");
		ar.add("LIVERPOOL");
		System.out.println("Size :"+ar.size()+"\tArray :"+ar);
		ar.remove("LIVERPOOL");//overriden to take integer or object
		System.out.println("Size :"+ar.size()+"\tArray :"+ar);
		//ar.removeAll(ar);
		//System.out.println("Size :"+ar.size()+"\tArray :"+ar);
		ar.clear();
		try{
		System.out.println("Size :"+ar.size()+"\tArray :"+ar);
		}catch(Exception e){System.out.println("MEMORY CLEARED");}
	}
}
