class A{

   int a;
   String name;
   A()
   {
      a=20;
      name="pupun";
   }
   void display()
   {
      System.out.println(a+" "+ name);
   }
}
   class constructer{
   public static void main(String[] args) {
      A obj=new A();
      obj.display();
   }

}
