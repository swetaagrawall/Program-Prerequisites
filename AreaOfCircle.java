import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        int radius =sc.nextInt();
        double pi = 3.142, area;
        area = pi * radius * radius;
        System.out.println("Area of circle is :" + area);
    }
}