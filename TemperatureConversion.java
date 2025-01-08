import java.util.Scanner;
public class TemperatureConversion{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
    System.out.println("Enter temperature in celsius :");
    double a=sc.nextDouble();
     System.out.println("Temperature in Fahrengeit is : "+ (a*(9/5)+32));
}
}