

public class test {
//
	
	// Create a Circle object passing in user input
	public static void main(String[] args){
		
	
	circle c1=new circle(5);
	circle c2=new circle(10,6);
	
	System.out.println("display information");
	System.out.println("radius is :"+c1.getradius());
	System.out.println("radius is :"+c2.getradius());
	System.out.println("length is :"+c2.getlength());
	System.out.println("Diameter is " + c1.getDiameter());
	System.out.println("Area is " + c1.getArea());
    System.out.println("Circumference is " + c1.getCircumference());
    System.out.println("angle is :"+c2.getAngle());
    
	
	
	
	
	
	}	
}
