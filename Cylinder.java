package Shapes;
import java.util.Scanner;
public class Cylinder implements Volume_cal
{
    int r,he;
    public void volume()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input radius");
        r=sc.nextInt();
        System.out.println("Input height");
        he=sc.nextInt();
        System.out.println("volume of cylinder:"+(3.14*r*r*he));
    }
}

