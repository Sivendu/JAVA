package graphics;
import java.util.Scanner;
public class Circle implements Area_cal
{
    double radius;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input radius");
        radius=sc.nextInt();
        System.out.println("Area of circle:"+(3.14*radius*radius));
    }
}
