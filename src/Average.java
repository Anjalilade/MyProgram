import java.util.Scanner;
public class Average {
    void cal(int a,int b,int c){
        float average=(a+b+c)/3;
        System.out.println("The average of given three number is:"+average);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the three number");
        a=sc.nextInt();
        b=sc.nextInt();
       c=sc.nextInt();
        Average obj=new Average();
        obj.cal(a,b,c);
    }
}
