import java.util.Scanner;
class Sports
{
    String sport;
    int rating;
    Sports(String sp,int rt)
    {
        sport=sp;
        rating=rt;
    }
}
class Student extends Sports
{
    String grade;
    double overall_per;
    Student(String sp,int rt,String gd,double per)
    {
        super(sp,rt);
        grade=gd;
        overall_per=per;
    }
}
class Result extends Student
{
    Result(String sp,int rt,String gd,double per)
    {
        super(sp,rt,gd,per);
    }
    void display()
    {
        System.out.println("\n sports details of student");
        System.out.println("------------------------------");
        System.out.println("Sports:"+sport);
        System.out.println("Rating:"+rating);
        System.out.println("\n Academic details of student");
        System.out.println("-------------------");
        System.out.println("Academic grade"+grade);
        System.out.println("percentage"+overall_per);
    }
}
public class School
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sports Details of student");
        System.out.println("sport");
        String s=sc.next();
        System.out.println("sport rating out of 10:");
        int r=sc.nextInt();
        System.out.println("enter Academic details of student:");
        System.out.println("Academic Grade(A-D)");
        String g=sc.next();
        System.out.println("percentage:");
        double p=sc.nextDouble();
        sc.close();
        Result ob=new Result(s, r, g, p);
        ob.display();
    }
    
}
