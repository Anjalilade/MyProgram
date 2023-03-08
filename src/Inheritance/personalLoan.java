package Inheritance;

public class personalLoan extends Loan {
    public static void main(String[] args) {
        personalLoan personalLoan=new personalLoan();
        personalLoan.LoanId=100;
        personalLoan.LoanAmount=100;
        personalLoan.rateOfInterest=20000;
        personalLoan.LoanDuration=3;
        System.out.println(personalLoan);

    }

}
