import java.util.*;
import java.lang.reflect.Array;

public class bubblesearch {
    public static void main(String args[]){
        int arr[]={4,6,8,2,7};
        int temp;
        System.out.println("Unshorted array is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                  temp =arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
        System.out.println(" The shorted array is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    
}
