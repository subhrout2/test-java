public class exception {
 public static void main(String[] args) {
    System.out.println("main method start");
    int a=10,b=0,c;
    try{
    c=a/b;
    System.out.println(c);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Can't devide by zero");
    }
    System.out.println("main method start");
 }   
}
