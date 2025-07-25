import java.util.Scanner;

public class Factorialnum {
    
    //method write outside the main method

    /*
     * Method is a Block of code that performs a specific task. 
     * It helps to organize code, reuse logic, and avoid repetiton. 
     */

    static int factorial(int n){  //  static keyword says the method is call through the class. without creating object. 
            if (n==0 || n==1) return 1;  //base case
            return n* factorial (n-1);   //recursive call
        }

        /*
         * Recursion means a method calling itself to solve a problem 
         * It's used when a problem can be broken down into smaller subproblems of the same type. 
         * 
         * recursive function requirements are : base case and recursive call
         * base case: a condition where the recursion stops.
         * recursive call: the function call itself with smaller input. 
         * when we use loop to find factorial is shows output each iteration. 
         * but in recursive function its shows only final iteration. 
         */
    public static void main(String[] args) { //Public Static void is a access specifier
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int result = factorial(n); //call method

        System.out.println("Factorial of " + n + " is " + result);

    }
}
