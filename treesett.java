import java.util.*;
 public class treesett {
    public static void main(String args[]){
        TreeSet <Integer> set=new TreeSet<Integer>();
        set.add(10);
        set.add(40);
        set.add(20);
        set.add(30);
        set.add(50);
        set.add(30);//no duplicate value 
        System.out.println(set);//sorted values
        System.out.println(set.size());
        set.clear();//delete all value from the set
        System.out.println(set);
    }
}