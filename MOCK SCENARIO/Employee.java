import java.util.ArrayList;
class Employee{
	int eid;
	String name;
	double bp;
	Employee(){
		eid=0;
		name="\0";
		bp=0.0;
	}
	Employee(int eid,String name,double bp){
		this.eid=eid;
		this.name=name;
		this.bp=bp;
	}
	public String toString(){
		return "\nID :"+eid+"\nName :"+name+"\nBasic Pay :"+bp;
	}
}
class EmployeeList{
	ArrayList<Employee> el=new ArrayList<Employee>();
	EmployeeList(){
		el=new ArrayList<>();
	}
	void addEmployee(int eid,String name,double bp){
		el.add(new Employee(eid,name,bp));
	}
	boolean removeEmployee(int eid){
		Employee del=null;
		for(Employee i:el){
			if(i.eid==eid){
				del=i;
				break;
			}
		}
		if(del!=null){
			el.remove(del);
			return true;
		}
		else
			return false;
			
	}
	boolean update(int eid,Employee e){
		Employee del=null;
		int index=0;
		for(Employee i:el){
			if(i.eid==eid){
				del=i;
				index=el.indexOf(i);
				break;
			}
		}
		if(del!=null){
			el.remove(del);
			el.add(index,e);
			return true;
		}
		else
			return false;
		
	}
	boolean search(int eid){
		boolean flag=false;
		for(Employee i:el){
			if(i.eid==eid)
				flag=true;
		}
		return flag;
	}
}