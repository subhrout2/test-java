import java.util.*;
import java.util.HashMap;
 public class hashmap {
    public static void main(String args[]){
    HashMap < String ,Integer> map = new HashMap<String,Integer>();
    map.put("first", 20);
    map.put("second", 50);
    map.put("third", 10);
    map.put("fourth", 60);
    map.put("fifth", 42);
    map.put("sixth", 4);
    map.put("apple", 14);
    System.out.println("Hash map is  :"+ map);
    System.out.println("value of apple is :"+map.get("apple"));
    System.out.println(map.keySet());
    System.out.println(map.values());
    }
 }
    