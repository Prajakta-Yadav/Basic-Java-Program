import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int Original = num;
        int rev =0;
        while (num>0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;

        } 
        System.out.print("The Reversed value of " + Original + " is " + rev);
    }
}
 