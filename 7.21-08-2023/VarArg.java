//a be a variable argument of same type....NOTE: VARIABLE ARGUMENTS SHOULD BE DECLARED TOWARDS THE RIGHT and only ONE VARIABLE ARGUMENT PARAMETER IS ALLOWED//
/*class VarArg{
	static void dispValues(var...a){  //here a will be variable number of arguments with different type//
		System.out.println("length="+a.length+"\tContents..");
		for(var x:a)
			System.out.println(x);
	}
	public static void main(String args[]){
		String n1[]={"CSE","IT"};
		int n2[]={10,20};
		dispValues(n1);
		dispValues(n2);
	}	
}*/

/*VarArg.java:3: error: 'var' is not allowed here
        static void dispValues(var...a){  //here a will be variable number of arguments with similar type//
                               ^
1 error*/


//so use//
class VarArg{
	static void dispValues(String...a){  //here a will be variable number of arguments with similar type//
		System.out.println("length="+a.length+"\tContents..");
		for(var x:a)
			System.out.println(x);
	}
	static void dispValues(int...a){  //here a will be variable number of arguments with similar type//
		System.out.println("length="+a.length+"\tContents..");
		for(var x:a)
			System.out.println(x);
	}
	public static void main(String args[]){
		String n1[]={"CSE","IT"};
		int n2[]={10,20};
		dispValues(n1);
		dispValues(n2);
		/*dispValues(); VarArg.java:39: error: reference to dispValues is ambiguous (because it points to all functions above)
                		dispValues();
                		^
				both method dispValues(String...) in VarArg and method dispValues(int...) in VarArg match
				1 error*/
	}	
}