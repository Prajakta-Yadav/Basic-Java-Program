import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){

        System.out.println("Enter the values for calculate SI:");

        Scanner sc = new Scanner(System.in);
         System.out.print("P:");
        int P = sc.nextInt();
       
        System.out.print("R:");
        int R = sc.nextInt();
        
        System.out.print("T:");
        int T = sc.nextInt();

        int SI = (P * R * T)/ 100;

        System.out.println(SI);
        System.out.println("Total amount:" + (P + SI));
    }
}
