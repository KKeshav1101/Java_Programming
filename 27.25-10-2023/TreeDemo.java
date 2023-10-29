import java.util.TreeMap;
class MyComp implements Comparator<String>{
	public int compare(String s1,String s2){
		return s1.compareTo(s2);
	}
}
class MyComp1 implements Comparator<String>{
	public int compare(String s1,String s2){
		int i=s1.substring(s1.lastIndex(" ")).compareTo(s2.substring(s2.lastIndex(" ")));
		if(i==0)
			return s1.compareTo(s2);
		else
			return i;
	}
}
class TreeDemo{
	public static void main(String args[]){
		//using thenComparing()-not actually needed though
		TreeMap<String,Double> hm=new TreeMap<String,Double>(new MyComp1().thenComparing(new MyComp()));
		hm.put(new String("Chelsea"),2.2);
		hm.put("Mason Mount",11.11);
		hm.put("CM Pulisic",22.22);
		System.out.println(hm);
		for(var me:hm.entrySet())
			System.out.println(me.getKey()+","+me.getValue());
		Double balance=hm.get("CM Pulisic");
		hm.put("CM Pulisic",balance+1000);
		System.out.println(hm.get("CM Pulisic"));
	}
}