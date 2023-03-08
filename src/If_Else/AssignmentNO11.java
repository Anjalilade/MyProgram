package If_Else;

public class AssignmentNO11 {
    public static void main(String[] args) {
        int year=2022;
        if (year%400==0||(year%1100!=0&&year%4==0)){
            System.out.println("it is leap year");
        }
        else{
            System.out.println("it is not leap year");
        }
    }
}
