import java.util.Scanner;
public class MatrixAddition
{
 public static void main(String[] args) 
 {
    int row,col,i,j;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    row=s.nextInt();
    System.out.println("Enter the number of columns:");
    col=s.nextInt();
    int Mat1[][]=new int[row][col];
    int Mat2[][]=new int[row][col];
    int res[][]=new int[row][col];
    System.out.println("Enter the elements of matrix 1:");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            Mat1[i][j]=s.nextInt();
        }
    }
    System.out.println("Enter the elements of matrix 2");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
            {
                Mat2[i][j]=s.nextInt();
                res[i][j]=Mat1[i][j]+Mat2[i][j];
            }
        }
        System.out.println("Sum of matrix :");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            System.out.println(res[i][j]+"\t");
            System.out.println();
    }
}   
}

