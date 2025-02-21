import java.util.Scanner;
public class Faculty
{
    int age;
    String name;
    void getData( )
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\nEnter Faculty name:");
        name=scan.nextLine();
        System.out.println("\n\nEnter Faculty age:");
        age=scan.nextInt();
    

        }
void display()
{
    System.out.println("Faculty Name:"+name);
    System.out.println("Faculty no:"+age);
}
public static void main(String args[])
{
    Faculty e=new Faculty();
    e.getData();
    System.out.println("\n\n Faculty Detials\n");
    System.out.println("\n\n.....................\n");
    e.display();
}}