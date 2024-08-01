import java.util.Arrays;

public class arraysorting {
    public static void main(String args[]){
        int arr[]={4,6,8,2,7};
        System.out.println("the unsorted array is:");
        for(int e : arr)
         System.out.print(e+",");
        Arrays.sort(arr);
        System.out.println();
        System.out.println("the sorted array is:");
        for(int e : arr)
        System.out.print(e+",");
    }
    
}