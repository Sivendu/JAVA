import java.util.Scanner; 
public class SymmetricMatrix 
{
    public static void main(String[] args)
    {
        boolean symmetric=true;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows=s.nextInt();
        System.out.println("enter no of columns");
        int cols=s.nextInt();
        int[][]matrix=new int[rows][cols];
        System.out.println("enter elmnts of matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=s.nextInt();
            }
        } 
        if(rows!=cols)
        {
            System.out.println("the matrix is not symmetric");
        }
        else
        {
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    if(matrix[i][j]!=matrix[j][i])
                     {
                        symmetric=false;
                        break;
                     }
                }
            }
        if(symmetric)
        {
            System.out.println("the matrix is symmetric");
        }
        else
        {
            System.out.println("the matrix is not symmetric");
        }
    }
 }
}
