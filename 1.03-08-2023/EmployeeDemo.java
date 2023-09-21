class Employee{
	int emp_id,basic_sal;
	void setemp(int id,int sal){
		emp_id=id;
		basic_sal=sal;
	}
	public String toString(){
	return "Employee Id:"+emp_id+"\nBasic Salary :"+basic_sal;
	}
}
class EmployeeDemo{
	public static void main(String args[]){
		Employee emp1=new Employee();
		emp1.setemp(11,110000);
		System.out.println("emp1 details:"+emp1);
	}
}