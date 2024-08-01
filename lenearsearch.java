import java.util.Scanner;
public class lenearsearch{
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6,7,8,9};
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the element");
       int search =sc.nextInt();
       int flag=0;
       
       for(int i=0;i<arr.length;i++)
       {
        if( arr[i]==search)
        {
        flag=1;
        break;
        }
       }
       if(flag==1)
       {
        System.out.println("Search is Sucessful ");
       }
       else
       {
        System.out.println("Element not Found");
       }

    }
}