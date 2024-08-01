import java.util.*;
 public class priorityqueue {
    public static void main(String args[]){
    PriorityQueue <Integer> queue = new PriorityQueue<Integer>();// by default priority queue in java set to be small  to large
    //PriorityQueue <Integer> queue = new PriorityQueue<>(Comparator.reverseOrder()); // this is use 
    queue.offer(10);
    queue.offer(20);  
    queue.offer(40);
    queue.offer(5);
    System.out.println(queue.size());
    System.out.println("priority queue is :"+queue);
    System.out.println("peek of the queue is :"+queue.peek());
    }
}//here min Heap means smallest element of the queue go to the first pposition
 //here max Heap means largest element of the queue go to the first pposition  