import java.util.*;

public class powerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base:");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent:");
        double exponent = sc.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println(base + " to the power of " + exponent + " is: " + result);
    }
}
