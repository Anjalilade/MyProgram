package Loop_Loop;

public class demo5_All_Loop {
    public static void main(String[] args) {
        System.out.println("For Loop");
        for (int counter = 0; counter <11 ; counter++) {
            System.out.println(counter);

        }
        System.out.println("While Loop");
        int i=0;
        while (i<11) {
            System.out.println(i);
            i++;
        }
        System.out.println("Do While Loop");
        int count=0;
        do{
            System.out.println(count);
            count++;
        }while (count<11);

    }
}
