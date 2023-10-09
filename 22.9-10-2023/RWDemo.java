import java.io.*;
class RWDemo{
	public static void main(String args[]) throws Exception{
		Reader r=new InputStreamReader(System.in);
		char data[]=new char[100];
		r.read(data);
		Writer w=new OutputStreamWriter(System.out);
		w.write(data);	
		w.close();
		r.close();	
	}
}