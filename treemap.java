import java.util.*;
 public class treemap {
    public static void main(String args[]){
   TreeMap < String ,Integer> map = new TreeMap<String,Integer>();
   map.put("first", 20);
   map.put("second", 50);
   map.put("third", 10);
   map.put("fourth", 60);
   map.put("fifth", 42);
   map.put("sixth", 4);
   map.put("apple", 14);
    System.out.println("Tree  map is  :"+ map);
    System.out.println(map.keySet());
    System.out.println(map.values());
    System.out.println(map.get("apple"));
    }
 }
    