package class_Object;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        char grade=calculateGrade(marks);
        System.out.println("Your score card:marks:"+marks+"\t"+"Grade:"+grade);

    }
    private static char calculateGrade(int marks){
        char grade=0;
        if (marks<25){
            grade='F';
        } else if (marks>=25&&marks<45) {
            grade='E';

        } else if (marks>=45&&marks<50) {
            grade='D';

        } else if (marks>=50&&marks<60) {
            grade='C';

        } else if (marks>=60&&marks<80) {
            grade='B';

        } else if (marks>=80) {

        }
        return grade;
    }
}
