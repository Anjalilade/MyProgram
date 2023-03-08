public class Animal2 {
    public void run() {
        System.out.println("I am running ");
    }

    public static void main(String[] args) {
        System.out.println("Madhuri is running");
        Animal2 anl = new Animal2();
        anl.run();
        anl.eat();
        Birds sp = new Birds();
        sp.fly();


    }

    public void eat() {
        System.out.println("Atul is eating");
    }
}
        class Birds{
        void fly(){
            System.out.println("I am flying");
        }
        }



