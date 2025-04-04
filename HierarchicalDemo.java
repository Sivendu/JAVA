import java.util.Scanner;
class Manager
{
    String mngrName;
    Manager(String mname)
    {
        mngrName=mname;
    }
}
class Employee extends Manager
{
    String empName;
    Employee(String mname,String ename)
    {
        super(mname);
        empName=ename;
    }
    void display()
    {
        System.out.println("Manager:"+mngrName);
        System.out.println("Employee:"+empName);
    }
}
class Staff extends Manager
{
    String stfName;
    Staff(String mname,String sname)
    {
        super(mname);
        stfName=sname;
    }
    void display()
    {
        System.out.println("Manager:"+mngrName);
        System.out.println("Staff:"+stfName);
    }
}
public class HierarchicalDemo
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Details:");
      System.out.println("Manager Name");
      String m=s.next();
      System.out.println("Employee Name:");
      String e=s.next();
      System.out.println("Staff Name:");
      String st=s.next();
      Employee ob1=new Employee(m,e);
      System.out.println("Manager Employee Details");
      System.out.println("..............");
      b1.display();
      Staff ob2=new Staff(m,st);
      System.out.println("Manager staff Details:");
      System.out.println("..............");
      ob2.display();
      s.close();
    }
}