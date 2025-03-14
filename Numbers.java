import java.util.Scanner;
public class Numbers
{
    void sum(int x1,int y1)
    {
        System.out.println("sum of 2 nos"+(x1+y1));
    }
    void sum(int x2, int y2,int z2)
    {
        System.out.println("sum of s nos"+(x2+y2+z2));
    }
    void sum(int x3,double d1)
    {
        System.out.println("\nsum of 3 nos using double"+(d1+x3));
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter x");
        int x=s.nextInt();
        System.out.println("enter y");
        int y=s.nextInt();
        System.out.println("enter z");
        int z=s.nextInt();
        System.out.println("enter d");
        double d=s.nextDouble();
        Numbers ob=new Numbers();
        ob.sum(x,y);
        ob.sum(x,y,z);
        ob.sum(x,d);
    }
}
