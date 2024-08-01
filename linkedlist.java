import java.util.*;
import java.util.LinkedList;
import java.util.List;
 public class linkedlist {
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(10);
        list.add(40);
        list.add(6);
        list.add(60);
        list.add(5);
        list.add(6);
        //Collections.sort(list);//sorting done here
        System.out.println(list);    
    }
}