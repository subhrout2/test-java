import java.util.Scanner;
interface client {
void input();//public+abstract
void output();//public+abstract
}

class intrface implements client {
    String name;double sal;//public+static+final
    public void input(){
    Scanner sc = new Scanner(System.in);    
    System.out.println("Enter the Name");
    name=sc.nextLine();
    System.out.println("Enter the Salary");
    sal=sc.nextDouble();
    }
    public void output(){
        System.out.println(name+" "+sal);
    }
   public static void main(String[] args) {
    client obj=new intrface();
    obj.input();
    obj.output();
   } 

}