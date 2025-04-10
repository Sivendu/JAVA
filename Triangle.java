package graphics;
import java.util.Scanner;
public class Triangle implements Area_cal
{
    int b,h;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input base");
        b=sc.nextInt();
        System.out.println("Input height");
        h=sc.nextInt();
        System.out.println("Area of Triangle:"+(.5*b*h));
    }
}

