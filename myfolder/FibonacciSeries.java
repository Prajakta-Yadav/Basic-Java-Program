import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fibonacci Series number:");
        int n = sc.nextInt();
        sc.close();
        int a =0;
        int b =1;
        for(int i=2; i<=n; i++){
            int fib = a + b;
            System.out.println(fib);
            a= b;
            b= fib;
        }

        
    }
}
