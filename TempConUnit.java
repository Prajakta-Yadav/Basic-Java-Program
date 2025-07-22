import java.util.Scanner;

public class TempConUnit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Fahrenheit -> Celsius:");
        float F = sc.nextFloat();
        float Cel = (F - 32) * 5/9;

        System.out.println("Fahrenheit -> Celsius:" + Cel);
 

        System.out.print("Celsius -> Fahrenheit:");
        float C = sc.nextFloat();
        float Fah = ((C * 9/5) + 32);

        System.out.println("Celsius -> Fahrenheit:" + Fah);
    }
}
