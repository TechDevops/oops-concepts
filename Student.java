

public class Student extends company {
    static int age ;
    
    String position,status;
	double salary,yearsofservice;
	
	
	public Student(String name, String address,int age , int number, double salary,double yofs,String status) {
		super(name, address, number);
		this.salary=salary;
		this.age=age;
		this.yearsofservice=yofs;
		this.status=status;
	}
	void print(){
		System.out.println("student successfuly joined in company");
	}
	
	public static int getAge()
	{
		return age;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getposition()
	{
		return position;
	}
	// nonstatic methods
	public  void setAdmission()
	{		
		if(this.age>=18 && this.age<=25)
		{
			this.position="junior developer";
			System.out.println(" position set to :"+position);			
		}
		else if (this.age>=26 && this.age<=60)
		{
			this.position="senior developer";
			System.out.println(" position set to :"+position);
		}
		else 
		{
			System.out.println("not employed ");
		}
	}	//void
	public  void setAdmission(String name,String empid){
		if(this.empid.equals(empid)) {
		 System.out.println("Authorised employee");	
		}
		else {
			System.out.println("unAuthorised employee");
		}
	}	
	public void sethike()
	{
		if(status.endsWith("current")) {
		if(this.yearsofservice>0&&this.yearsofservice<4){
			this.salary=salary+10000.0;
		}
		else if(this.yearsofservice>=5&&this.yearsofservice<=10) {
			this.salary=salary+20000.0;
		}
		}
	}
} //class
