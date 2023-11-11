class Airlines{
	String Name;
	String P_id;
	String Fno;
	String Src;
	String Dest;
	Airlines(){
		Name="\0";
		P_id="\0";
		Fno="\0";
		String Src="\0";
		String Dest="\0";
	}
	Airlines(String Name,String P_id,String Fno,String Src,String Dest){
		this.Name=Name;
		this.P_id=P_id;
		this.Fno=Fno;
		this.Src=Src;
		this.Dest=Dest;
	}
	Airlines(Airlines a){
		this.Name=a.Name;
		this.P_id=a.P_id;
		this.Fno=a.Fno;
		this.Src=a.Src;
		this.Dest=a.Dest;
	}
	public String toString(){
		return "\nName :"+Name+"\nPassenger Id :"+P_id+"\nFlight Number :"+Fno+"\nSource :"+Src+"\nDestination :"+Dest+"\n";
	}
}