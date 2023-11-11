import java.util.ArrayList;
class AirlinesManagement{
	ArrayList<Airlines> list=new ArrayList<Airlines>();
	void addDetail(Airlines A){
		
		list.add(A);
		System.out.println("Successfully added detail");
	}
	boolean searchPassenger(String pid){
		boolean flag;
		flag=false;
		try{
			for(Airlines i:list){
				if(i.P_id.equals(pid))
					flag=true;
			}
			if(flag==false){
				throw new PassengerNotFoundException("\nInvalid Id\n");
			}
		}
		catch(Exception e){
			System.out.println(""+e);
		}
		return flag;
	}
	Airlines displayPassenger(String id){
		for(Airlines i:list){
			if(i.P_id.equals(id))
				return i;
		}
		return null;
	}
}