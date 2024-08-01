import java.util.Scanner;
public class arraymultiplication {
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int a[][]= new int [3][3];
    int b[][]=new int [3][3];
    int c[][]= new int[3][3];
    System.out.println(" Enter the First matrix :");  // input of 1st matrix
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a.length;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println(" first matrix is :");  //display of 1st matrix
      for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a.length;j++)
        {
           System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println(" Enter the Second matrix :");  //input of 1st matrix
    for(int i=0;i<b.length;i++)
    {
        for(int j=0;j<b.length;j++)
        {
            b[i][j]=sc.nextInt();
        }
    }
    System.out.println(" Second matrix is:");  //display of 2nd matrix
      for(int i=0;i<b.length;i++)
    {
        for(int j=0;j<b.length;j++)
        {
           System.out.print(b[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("the matrix multiplication is:"); //logic of matrix multiplication
    for(int i=0;i<c.length;i++)
    {
        for (int j=0;j<c.length;j++)
        {
            c[i][j]=0;
            for (int k=0;k<c.length;k++)
            {
                c[i][j]= c[i][j]+a[i][k]*b[k][j];
            }
        }
    }
    for(int i=0;i<c.length;i++)   //display the resultant matrix
    {
        for (int j=0;j<c.length;j++)
        {
            System.out.print( c[i][j]+" ");
        }
        System.out.println();
    }
}
}
