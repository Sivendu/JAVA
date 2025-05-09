import java.util.Scanner;
public class Negative {
    static int a[]={44,55};
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        try
        {
            if(n>0)
            {
            System.out.println("Number accepted");
        }
        else
        {
        throw new NegativeException("Number rejected-Negative Number");
        }
    }
    catch(NegativeException e)
    {
        System.out.println(e.getMessage());
    }
}
    }
        