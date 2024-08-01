public class methodoverloading {
    public void sum()
    {
        int a=10;
        int b=20;
        int c;
        c=a+b;
        System.out.println(c);
    }
    public void sum(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println(c);
    }
    public void sum(int x,double y)
    {
        double c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        methodoverloading obj=new methodoverloading();// compile time polymorphism
        obj.sum();
        obj.sum(11, 22);
        obj.sum(5,11.89);
    }
}
