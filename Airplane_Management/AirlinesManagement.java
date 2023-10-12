class AirlinesManagement{
	Airlines[] list;
	int size;
	AirlinesManagement(){
		size=0;
	}
	AirlinesManagement(int size){
		this.size=size;
		list=new Airlines[size];
	}
	void addDetail(int number,Airlines A){
		list[number-1]=A;
		System.out.println("Successfully added detail");
	}
	boolean searchPassenger(int pid){
		boolean flag;
		flag=false;
		try{
			for(Airlines i:list){
				if(i.P_id==pid)
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
	void displayPassenger(int number){
		if(number<=size){
			System.out.println("Details\n"+list[number-1]);
		}
	}
}