package Shapes;
import java.util.Scanner;
public class Cube implements Volume_cal
{
    int a;
    public void volume()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input side");
        a=sc.nextInt();
        System.out.println("volume of cube:"+(a*a*a));
    }
}
