//Name:Chancheep Mahacharoensuk
//ID:u6288092
//Section:1

/*  The structure of Triangle class is similar to Rectangle */
public class Triangle extends Shape {
		   // Private member variables
		   //add your code here
			private double base;
			private double height;
		   // Constructors
		   public Triangle()
		   {
			  //add your code here
			   base=0;
			   height=0;
		   }
		   public Triangle(String color, double base, double height) {
		      //add your code here
			   super.setColor(color);
			   this.base=base;
			   this.height=height;
		   }

		   @Override
		   public String toString() {
		      //add your code here
			   return"Triangle[base="+base+",height="+height+","+super.toString()+"]";
		   }

		   // Override the inherited getArea() to provide the proper implementation
		   @Override
		   public double getArea() {
		      //add your code here
			   double area =0.5 *base *height;
			   return area;
		   }

		   public double getArea(double base, double height) {
			   	 this.base=base;
			   	 this.height=height;
			   	 return getArea();
			   }
   //add your code here

}
