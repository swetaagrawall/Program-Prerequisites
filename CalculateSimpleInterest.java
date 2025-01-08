import java.util.*;
public class CalculateSimpleInterest{
    public static void main(String args[])
    {   
	float Principal, Rate, Time;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Principal");
	Principal = sc.nextInt();
        System.out.println("Enter Rate");
	Rate = sc.nextInt();
	System.out.println("Enter Time");
	Time = sc.nextInt();
        
        float Simple_Interest = (Principal * Time * Rate) / 100;
        System.out.println("Simple interest = " + Simple_Interest);
    }
}