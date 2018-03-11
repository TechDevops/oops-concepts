

public class Test1 {
	public static void main(String[] args)
	{
		company s2=new Student("ram","peoria", 25, 123456789, 50000,1 ,"exemployee"); 
		//Student(String name, String address,int age , int number, double salary)
		Student s=new Student("soumya","chiacgo",20,773-866-1333,2000,3,"current");
		Student s1=new Student("ramya","illinois",43,773-866-1333,30000,5,"current");
		s.setAdmission();
		s.sethike();
		s1.setAdmission();
		s1.sethike();
		
		System.out.println("Name of student is :"+s.name +"\n address is :"+s.address+"\n age is :"+s.age);
		System.out.println("position is :"+s.position);
		System.out.println("years worked is :"+s.yearsofservice);
		System.out.println("hike salary:"+s.salary);
		// second object
		System.out.println("Name of student is :"+s1.name +"\n address is :"+s1.address+"\n age is :"+s1.age);
		System.out.println("position is :"+s1.position);
		System.out.println("years worked is :"+s1.yearsofservice);
		System.out.println("hike salary:"+s1.salary);
		s2.details();
		s2.print();
		s1.setAdmission("sam","1234");
		
		
	   //company s1=new Student();
	}
}
