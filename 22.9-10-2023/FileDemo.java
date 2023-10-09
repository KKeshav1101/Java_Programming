import java.io.*;
class FileDemo{
	public static void main(String args[]) throws Exception{
		File f=new File("Sample.txt");
		FileWriter fw=new FileWriter(f);
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));  //System.in is a stream object so stream is converted to reader object using inputstreamreader
		char c;
		do{
			c=(char)bf.read();
			fw.write(c);
		}while(c!='q');	
		bf.close();
		fw.close();
	}
}
