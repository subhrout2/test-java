import java.util.*;
 public class linkedhashset {
    public static void main(String args[]){
       LinkedHashSet <Integer>set=new LinkedHashSet<Integer>();
        set.add(5);
        set.add(2);
        set.add(7);
        set.add(9);
        set.add(2);//no duplicate value 
        System.out.println(set);//ordered serires    
    }
}