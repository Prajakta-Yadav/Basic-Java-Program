import java.util.Scanner;

public class AreaOfCircle
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the radius of circle: ");
	    float radius = scan.nextFloat();
	    final float PI = 3.140f;
	    
	    float Area = PI *radius *radius;
	    
	    System.out.println("Area of circle: " + Area);
	    
	    
	}
}
