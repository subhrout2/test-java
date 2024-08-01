import java.util.*;
 public class arraydeque {
    public static void main(String args[]){
        Deque<Integer>deque=new ArrayDeque<Integer>();
        deque.add(10);
        deque.offer(40);
        deque.add(30);
        deque.offer(60);
        deque.add(50);
        System.out.println("deque  ="+deque); 
        System.out.println(deque.poll()); 
        System.out.println("deque  ="+deque);   
        System.out.println(deque.peek());
        System.out.println("deque  ="+deque);
        deque.poll();
        System.out.println("deque  ="+deque);
        deque.remove(30);
        System.out.println("deque  ="+deque);
    }
}