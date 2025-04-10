import Shapes.Cube;
import Shapes.Cuboid;
import Shapes.Cylinder;
import java.util.Scanner;
public class ShapesDemo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        Cube ob1=new Cube();
        Cuboid ob2=new Cuboid();
        Cylinder ob3=new Cylinder();
        
        while (true)
        {
            System.out.println("\n1)Cube\n2)Cuboid\n3)Cylinder");
            System.out.println("Enter your choice(1-4)");   
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                ob1.volume();
                    break;
                case 2:
                ob2.volume();
                break;
                case 3:
                ob3.volume();
                break;
                case 4:
                System.out.println("Exiting!!");
                System.exit(0);
                default:
                    break;
            } 
        }

    }
}
