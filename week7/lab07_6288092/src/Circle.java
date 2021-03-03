//Name:Chancheep Mahacharoensuk
//ID:u6288092
//Section:1
import java.lang.Math;
public class Circle extends Shape {
		   // Private member variables
		   //add your code here
			private double radius;
		   // Constructors
		   public Circle()
		   {
			  //add your code here
			   radius=0;
		   }
		   public Circle(String color, double radius) {
		      //add your code here
			   super.setColor(color);
			   this.radius=radius;
		   }

		   @Override
		   public String toString() {
		      //add your code here
			   return"Circle[radius="+radius+","+super.toString()+"]";
		   }

		   // Override the inherited getArea() to provide the proper implementation
		   @Override
		   public double getArea() {
		      //add your code here
			   double area = Math.PI * Math.pow(radius, 2);
			   return area;
		   }

		   public double getArea(double radius) {
			   	 this.radius=radius;
			   	 return getArea();
			   }
}
