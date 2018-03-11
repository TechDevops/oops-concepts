

public class company {  
	
	String name ;
	String address ;
	int number ;
	String empid;
	public company(String name,String address , int number)
	{
		this.name=name;
		this.address=address;
		this.number=number;
	}
	
	
	void print()
	{
		System.out.println("details of student who is willing to join in company);");
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public int getnumber()
	{
		return number;
	}
	public void details()
	{
		System.out.println("name is :"+this.name +"\n Address is : "+ this.address);
	}
}


