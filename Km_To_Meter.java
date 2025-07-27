import java.util.Scanner;

public class Km_To_Meter
{
	public static void main(String[] args) {
		System.out.print("Enter Distance in Kilometer: ");
		Scanner scan = new Scanner(System.in);
		float Dis_Km = scan.nextFloat();
		
		float Meter = Dis_Km *1000;
		System.out.println("Distance in Meter: "+ Meter);
		
	}
}
