import java.io.*;
class ReadDemo{
	public static void main(String args[])throws Exception{
		File f=new File("Sample.txt");
		FileReader fw=new FileReader(f);
		char c=(char)fw.read();
		while(c!='q'){
			System.out.print(c);
			c=(char)fw.read();
		}
		fw.close();
	}
}