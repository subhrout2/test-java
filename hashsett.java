import java.util.*;
 public class hashsett {
    public static void main(String args[]){
        Set<Integer>set=new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);//no duplicate value 
        System.out.println(set);//unordered serires
        boolean b1= set.contains(20);
        System.out.println("20 present or not ="+ b1);    
    }
}