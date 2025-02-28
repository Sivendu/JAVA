class Employee
{
    int eno;
    String name;
    Employee(int r,String n)
    {
        eno=r;
        name=n;
    }
    void display()
    {
        System.out.println("Employee Detials");
        System.out.println(".......");
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+eno);
    }  
}
public class ConstructorDemo2
{
    public static void main(String args[])
    {
        Employee ob=new Employee(1,"krish");
        ob.display();
    }
}