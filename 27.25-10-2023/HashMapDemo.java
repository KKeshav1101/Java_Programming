import java.util.HashMap;
class Demo{
	public static void main(String args[]){
		HashMap<String, Double> hm=new HashMap<String,Double>();
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