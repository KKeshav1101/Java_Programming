//OBJECT AS PARAMETER OR AS RETURN TYPE//
-----------------------------------------
class Test{
	int a;
	Test(int a){      			//single parameter constructor
		this.a=a;
	}
	Test(Test t){ 				//object as parameter constructor- copy constructor
		this.a=t.a;
	}
	public String toString(){
		return "a="+a;
	}
	/*void update(Test t){  		//passing object as a parameter in member function is used to update data member 					and not just initialize like a constructor//
		this.a=t.a;  			//here calling object is updated
		t.a+=10;    			//here object that is passed as a parameter is updated
	}*/
	Test update (Test t){
		return new Test(this.a+t.a); 	//returns classtype Test with the help of constructor//nameless anonymous object//
	}
}

class TestDemo{
	public static void main(String args[]){
		Test t1=new Test(10);
		System.out.println("t1 before :"+t1);
		Test t2=new Test(t1);  		//copy constructor
		t1.update(t2);			//can update t2 by calling function with the help of t1
		t1.update(t1);			//can update t1 itself
		System.out.println("t2 after :"+t2);
		Test t3=t1.update(t2);		//does t3=t1+t2//t3 is a named object
		System.out.println("t3 after :"+t3);
	}

}
------------------------------------------
//it is seen that making an updation outside is reflected in the class//
//this is alllowed if default access specifier is used in the class- others- private and restricted can restrict//
//since current data member is accessible- semantically(if not syntactically) its better to just call using access specifier rather than caling function on itself//
//NOTE: WHILE OVERLOADING- RETURN TYPE BEING DIFFERENT ISNT ENOUGH- PARAMETERS HAVE TO BE NECESSARILY DIFFERENTIATED EITHER BY NUMBER OF PARAMETERS OR BY DATATYPE//