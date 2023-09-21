//Arrays
//dec : type varname[];
//varname=new type\\[size];for one array
//for 2d : type varname[][]=new type[size][size]; 
//For loop and for each loop experimentation
//==============================================//
class Test{
	public static void main(String args[]){
		int a[]={10,20,30,40,50,60} ; //or use int a[]={10,20,30,40,50} if necessary
		int sum=0;
		for(int v:a)
			sum+=v;
		System.out.println("Sum="+sum);
	}
}