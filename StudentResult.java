import java.util.Scanner;
public class StudentResult
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Marks");
		System.out.print("Physics: ");
		int Phy = scan.nextInt();
		
		System.out.print("Chemistry: ");
		int Che = scan.nextInt();
		
		System.out.print("Maths: ");
		int Maths = scan.nextInt();
		
		int total = Phy + Che + Maths;
		
		float Percen = (float)total/3;
			System.out.println("Total Marks: " + total);
		System.out.println("Student Result:" + Percen);
	}
}
