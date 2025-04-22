class EmployeeDetails
{
	int EmpId;
	int MobileNum;
	float EmpSalary;
	
	void SetData()
	{
		EmpId=0;
		MobileNum=0;
		EmpSalary=0;	
	}
	void SetData(int Id,int MN,float ES)
	{
		EmpId=Id;
		MobileNum=MN;	
		EmpSalary=ES;
	}	
	void display()
	{
		System.out.println("EmpId = "+EmpId);
		System.out.println("MobileNum = "+MobileNum);
		System.out.println("EmpSalary = "+EmpSalary);
	}
}

class EmpMain
{
 	 public static void main(String args[])
	{
		EmployeeDetails E1=new EmployeeDetails();
		E1.display();
		E1.setData(12308817,6302094705,75500.52f);
		E1.display();
	}

}