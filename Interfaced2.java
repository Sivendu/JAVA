interface shape
{
    int length=5;
    void display();

}
class Rectangle implements shape
{
    int breadth=10;
    public void display()
{
    System.out.println("Length="+length);
    System.out.println("Breadth="+breadth);
}
}
class Interfaced2
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        r.display();
    }
}