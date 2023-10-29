import java.util.*;
class HashMapDemo{
	public static void main(String args[]){
		HashMap<String, Double> hm=new HashMap<String,Double>();
		hm.put(new String("Chelsea"),new Double(2.2));
		hm.put("Mason Mount",11.11);
		hm.put("CM Pulisic",22.22);
		System.out.println(hm);
		for(var me:hm.entrySet())
			System.out.println(me.getKey()+","+me.getValue());	
	}
}