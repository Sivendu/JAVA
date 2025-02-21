public class Square
{
    double a;
    void getData(double side)
    {
        a=side;
    }
    double calArea()
    {
        return a*a;

    }
    public static void main(String args[])
    {
        Square s=new Square();
        s.getData(65);
        System.out.println("Area of square"+s.calArea());
    }
}