import java.util.Scanner;
public class Empl
{
    int empno;
    String name;
    void getData( )
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\nEnter Employee name:");
        name=scan.nextLine();
        System.out.println("\n\nEnter Employee number:");
        empno=scan.nextInt();
    

        }
void display()
{
    System.out.println("Employee Name:"+name);
    System.out.println("Employee no:"+empno);
}
public static void main(String args[])
{
    Empl e=new Empl();
    e.getData();
    System.out.println("\n\n Employee Detials\n");
    System.out.println("\n\n.....................\n");
    e.display();
}}