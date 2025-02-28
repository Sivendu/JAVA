import java.util.Scanner;
public class Matrix
{
    public static void main(String args[])
    {
        int row,col,i,j;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        row=S.nextInt();
        System.out.println("Enter the number of columns");
        col=S.nextInt();
        int matA[][]=new int[row][col];
        System.out.println("Enter the element of matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
            matA[i][j]=S.nextInt();

        }
    }
    System.out.println("Matrix");
    System.out.println("_______");
    for(i=0;i<col;i++)
    {
        for(j=0;j<col;j++)
        {
            System.out.println(matA[i][j]+"\t");
        }
        System.out.println();
    }
}
}