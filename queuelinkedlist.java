import java.util.*;
import java.util.Queue;
import java.util.List;
 public class queuelinkedlist {
    public static void main(String args[]){
        Queue<Integer>queue=new LinkedList<Integer>();
        queue.add(10);
        queue.offer(40);
        queue.add(30);
        queue.offer(60);
        queue.add(50);
        System.out.println("queue  ="+queue); 
        System.out.println(queue.poll()); 
        System.out.println("queue  ="+queue);   
        System.out.println(queue.peek());
        System.out.println("queue  ="+queue);  
        queue.poll();
        System.out.println("queue  ="+queue);
        queue.remove(30);
        System.out.println("queue  ="+queue);
    }
}