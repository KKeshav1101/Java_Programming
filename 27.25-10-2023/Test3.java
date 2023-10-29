import java.util.HashMap;
class Test3{
	public static void main(String args[]){
		String s[]={"Alice","Bob","Clark","Darth","Alice","Clark"};
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(String x:s){
			Integer c=hm.get(x);
			if(hm.get(x)==null)
				hm.put(x,1);
			else
				hm.put(x,++c);
		}
		System.out.println(hm);
	}
}