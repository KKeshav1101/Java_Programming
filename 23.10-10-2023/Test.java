import java.util.*;
class Test{
	public static void main(String args[]){
		ArrayList<String> ar=new ArrayList<String>();  //within angular, only class type
		ar.add("Chelsea");
		ar.add("Manchester");
		ar.add("Merseyside");
		System.out.println("Size :"+ar.size()+"\tArray :"+ar);
		ar.remove("Merseyside");//overriden to take integer or object
		System.out.println("Size :"+ar.size()+"\tArray :"+ar);
		ar.removeAll(ar);     //removeAll removes all elements in ar(1) that is in common with the argument ar(2).THUS HERE ALL ELEMENTS REMOVED
		System.out.println("Size :"+ar.size()+"\tArray :"+ar);
		ar.clear();//Also removes all elements but memory not deleted.
		try{
		System.out.println("Size :"+ar.size()+"\tArray :"+ar);
		}catch(Exception e){System.out.println("MEMORY CLEARED");}
	}
}
t