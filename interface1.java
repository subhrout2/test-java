
 interface A {
void Show();    
}
interface B{
    void Disp();
}
class interface1 implements A,B{
    public void Show()
    {
        System.out.println("interface A");
    }
    public void Disp()
    {
        System.out.println("interface B");
    }
    public static void main(String[] args) {
        interface1 obj =new interface1();
        obj.Show();
        obj.Disp();
    }
}