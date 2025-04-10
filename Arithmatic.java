import java.util.Scanner;
import pkgOperations.Add;
import pkgOperations.Substract;
import pkgOperations.Multiply;
import pkgOperations.Divide;
public class Arithmatic 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 no:");
        int a=sc.nextInt();
        System.out.println("Enter 2 no:");
        int b=sc.nextInt();
        Add ob1=new Add();
        Substract ob2=new Substract();
        Multiply ob3=new Multiply();
        Divide ob4=new Divide();
        ob1.cal(a, b);
        ob2.cal(a, b);
        ob3.cal(a, b);
        ob4.cal(a, b);

    }
}
