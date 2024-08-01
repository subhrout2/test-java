import java.util.*;
import java.util.Stack;
import java.util.List;
 public class stack {
    public static void main(String args[]){
        Stack<Integer>stack=new Stack<Integer>();
        stack.add(10);
        stack.add(40);
        stack.add(30);
        stack.add(60);
        stack.add(50);
        stack.add(0,1);
        //Collections.sort(stack);
        System.out.println("Stack  ="+stack); 
        System.out.println(stack.peek()); 
        System.out.println("Stack  ="+stack);   
        System.out.println(stack.pop());
        System.out.println("Stack  ="+stack);  
        stack.push(5);
        System.out.println("Stack  ="+stack);
        stack.remove(4);
        System.out.println("Stack  ="+stack);
        boolean b=stack.contains(30);
        System.out.println("30 present or not ="+ b);
    }
}