import java.util.*;
 public class dequeuearray {
    public static void main(String args[]){
        Deque<Integer>deque=new ArrayDeque<Integer>();
        deque.add(10);
        deque.offer(40);
        deque.offer(30);
        deque.offer(60);
        deque.offer(50);//offer and add do same things but add show exception some time
        deque.offerFirst(55);
        System.out.println("deque  ="+deque); 
        System.out.println(deque.poll()); 
        System.out.println("deque  ="+deque);   
        System.out.println(deque.peek());
        System.out.println("deque  ="+deque);  
        deque.poll();
        System.out.println("deque  ="+deque);
        deque.remove(30);
        System.out.println("deque  ="+deque);// remove and poll do the same things
    }
}