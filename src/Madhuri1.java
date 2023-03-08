public class Madhuri1 {
    String name;
    int age;
    public void intObj(String n,int a){
        name=n;
        age=a;

    }
    void display(){
        System.out.println(name +" " +age);
    }
    public static void main(String[] args) {
        Madhuri1 atul=new Madhuri1();
        atul.intObj("Bestuu" ,24);
        atul.display();

    }
}
