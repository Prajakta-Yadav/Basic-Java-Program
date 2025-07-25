import java.util.Scanner;

public class FactorialWithLoop {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int fact =1; 
        for (int i=1; i<=n; i++) {     // if we use here curle bracket they show each iteration output
            fact *=i;
            System.out.println(fact);  //if we not use curle bracket they show direct final output. 
    
         }
    }
}
