import java.util.Scanner;

public class AreaOfRectangle
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Height: ");
		float height = scan.nextFloat();
		System.out.print("Width: ");
		float width = scan.nextFloat();
		
		float Area = height * width;
		System.out.println("Area of Rectangle: " + Area);
	}
}
