import java.util.Scanner;

public class SwapTwonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two value:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Before Swapping two values");
        System.out.println(num1 + " " + num2);

        int Temp = num1;
        num1 = num2;
        num2 = Temp; 

        System.out.println("After Swapping two values");
        System.out.println(num1 + " " + num2);
    }
}
