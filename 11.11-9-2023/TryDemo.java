//using try-catch-finally and throws//
class TryDemo{
	public static void main(String args[]){
		try{
			int a=0;
			int x[]=new int[3];
			System.out.println(""+x[3]);
			int b=45/a;
			System.out.println(""+a);
		}catch(ArithmeticException e){
			System.out.println("Caught..."+e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught..."+e);
		}finally{
			System.out.println("Finally....");
		}
		System.out.println("After catch...");  
//since we using catch, we can continue even after error, which wouldnt have been possible with only jvm identifying error.//
	}
}	


/*
SYNTAX
---------------------------------------------------
try{
	//any java executable stmts
} //always immediately follow try with catch
catch(Exception object //parameter//){
	//handling exceptions
}
throw is used to manually throw an exception
throw new Exception(); //to manually raise generic exception
throw new NullPointerException(); //to raise specific exception

---------------------------------------------------
OUTPUT
---------------------------------------------------
(before adding index out of bounds error)
---------------------------------------------------
Caught...java.lang.ArithmeticException: / by zero
Finally....
After catch...
---------------------------------------------------
(after adding index out of bounds error)
---------------------------------------------------
Caught...java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
Finally....
After catch...
---------------------------------------------------
(after adding throw)
---------------------------------------------------

---------------------------------------------------
NOTE: Not always are we going to know the exact Exception, so we can use Exception as parameter type in catch instead of the specific Exception as a parameter- Its a generic exception class. But DON'T have it as the first catch's parameter.
*/