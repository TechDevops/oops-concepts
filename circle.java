

public class circle {
	
	final double PI = 3.14159;
	double radius;
	double  degrees;
	int length;
	public circle()
	{
		this.radius=radius;
	}
	//parameterised constructor 
	public circle(double r)
	{
		this.radius=r;		
	}
	
	// over riding
	public circle (int l,double r){
		this.length=l;
		this.radius=r;
	}

    /* public void setRadius(double r,int len) {
        radius = r;
        length=len;
        System.out.println("r is :"+radius);
        System.out.println(" length is :"+length);
    }  */
       public double getAngle(){
	       return ((360 * length) % getCircumference()); 
    	   //return (180 * length)/(PI*radius);
       }
       
    public double getradius() {
        return radius;
    }
    public double getlength(){
    	return length;
    }
    public double getDiameter() {
        return radius * 2;
    }
    public double getCircumference() {
        return 2 * PI * radius;
    }	
    public double getArea() {
        return PI * radius * radius;
    }
   

}
