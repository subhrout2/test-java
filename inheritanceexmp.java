 class inheritanceexmp{
    protected String brand="Ford";
    public void pick()
    {
        System.out.println("Tuk! Tuk!");
    }
}
class car extends inheritanceexmp{
    private String model="Mustang";
    public static void main(String args[]){
        car obj=new car();
        obj.pick();
        System.out.println(obj.brand+" "+obj.model);
    }
}