import java.util.*;
import java.util.Vector;
import java.util.List;
 public class vector {
    public static void main(String args[]){
        Vector<String> vector=new Vector<String>();
        vector.add("10");
        vector.add("40");
        vector.add("30");
        vector.add("60");
        vector.add("50");
        //Collections.sort(vector);// unsorted objects,ordered 
        System.out.println("vector ="+vector);    
    }
}