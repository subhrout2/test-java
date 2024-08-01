public class arrayaddition {
    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int c[][]=new int[3][3];
        System.out.println("the first matrix is :");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
         System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the Second matrix is :");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
         System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of two matrix is:");
        for( int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                 c[i][j]=a[i][j]+b[i][j];
            }
        }
        for( int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }



    }
    
}
// addition and subtraction is same method
