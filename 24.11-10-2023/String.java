//String handling in Java
/*
String class
StringBuilder and StringBuffer
//Constructors ***
//length, concat, toString ***
//char extraction charAt getChars getBytes toCharArray()***
//Comparison equals, equalsIngoreCase() == regionmatches startsWith endsWith compareTo compareToIgnoreCase***
//searching  indexOf lastIndexOf 
//substring concat replace trim  strip stripLeading Trailing***
//Conversion valueOf  toLowerCase toUpperCase
join ****
//additionals  contains isEmpty replaceFirst replaceAll split
//StringBuffer (syn, threadsafe mutable)...
//length capacity ensureCapacity setLength charAt setChatAt getChars() append() insert() reverse() delete deleteCharAt replace
//StringBuilder
*/
class Test{
	public static void main(String args[]){
		String s1=new String(); //default constructor to create an empty string
		String s2=new String("Chelsea"); //parametrized constructor
		char cdata[]={'C','H','E','L','S','E','A'};
		byte bdata[]={97,98,99};  //uses equivalent ASCII char (<127)...(>127 throws random symbols)
		String s3=new String(cdata); //char array using unicode
		String s4=new String(bdata); //Ascii 
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		System.out.println("s4="+s4);
		System.out.println(String.join(" ",s1,s2,s3,s4)); //join is a static fn
		for(int i=0;i<s2.length();i++)
			System.out.println("chat at..."+i+"\t"+s2.charAt(i));
		s2.getChars(0, 0, cdata, 0);
		System.out.println(new String(cdata));  
		String s10="SASTRA";
		String s11="SASTRA";
		String s12=new String("SASTRA");
		System.out.println(s10==s11); //true
		System.out.println(s11==s12); //false
		System.out.println(s10.equals(s12)); //true
		String s[]={"CSE","IT","ICT","AIDS","CSBC"};
		for(int i=0;i<s.length;i++)
			for(int j=0;j<s.length;j++)
				if(s[i].compareTo(s[j])<0){
					String t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
		for(String x:s)
				System.out.println(x);
	}
}