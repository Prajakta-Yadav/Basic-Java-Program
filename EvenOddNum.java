import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 ==0){
            System.out.println("The number is Even:" + num);
        }
        else {
            System.out.println("The number is Odd:" + num);
        }
    }
}
