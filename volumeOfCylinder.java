import java.util.Scanner;

public class VolumeOfCylinder{  
    public static void main(String args[])  
    {  
     Scanner sc = new Scanner(System.in);
    double height=sc.nextDouble();
      double radius=sc.nextDouble();  
    double pie=3.14285714286;  
    double volume=pie*(radius*radius)*height;  
    System.out.println("Volume of the cylinder="+volume);  
     }  
}  