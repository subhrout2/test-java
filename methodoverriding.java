   class A {
      void display()
    {
        System.out.println("this is super class"); 
    }
}
  class B extends A{
      void display()
    {
       // super.display();
        System.out.println("this is subclass");
    }
}
class  methodoverriding{
public static void main(String[] args) //runtime polymorphism
{
    A obj=new B();
    obj.display();
}
}
 