import java.util.Scanner;


public class SwapWithoutTemp {

    
    public static void main(String[] args){
        System.out.println("Enter Two numbers:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Before Swapping Two Numbers:" + num1 + " " + num2);
        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swapping Two Numbers:" + num1 + " " + num2);

    }
}
