abstract class A {
    void display(){
        System.out.println("First");
    }
}
class abbstract extends A{

    public static void main(String[] args) {
        A obj=new abbstract();
        obj.display();
    }
}
