package day08_ternaries_switch;

public class Loans {
    public static void main(String[] args) {

        int salary = 40000;
        int creditScore= 450;

        String loan = (salary>=60000&&creditScore>=650)?"Loan approved":"denied";

        System.out.println(loan);











        /*
        . Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
       */






    }
}
