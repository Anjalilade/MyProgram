package Operator;
// The total number of student in a class are 90 out of which 45 are boys.
// If 50% of the total student secured grade 'a' out of which 20 boys, then write a program to calculate te total number of girls getting grade 'a'

public class AssignmentNO12 {
    public static void main(String[] args) {
    int total=90;
    int boys=45;
    int girls=total-boys;
    int Agrade_boys=20;
    float per=(50*total)/100;
    float sc=per-Agrade_boys;
        System.out.println("total; girls are");
        System.out.println(girls);
        System.out.println("girls who get a grade");
        System.out.println(sc);
        System.out.println(per);



    }
}
