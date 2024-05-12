package day17_customClass;

public class testSalaryObject {
    public static void main(String[] args) {

        salaryCalculator salary1=new salaryCalculator();
        salary1.setInfo(8.5,8,18,40);

        salaryCalculator salary2=new salaryCalculator();
        salary2.setInfo(55,6,25,45);

        System.out.println(salary1);
        System.out.println(salary2);

        System.out.println("Salary1 Federal tax: "+salary1.federalTax());
        System.out.println(salary1.stateTax());
        System.out.println(salary1.salaryAfterTax());
        System.out.println(salary1.Salary());

        System.out.println("Salary2 federal tax: "+salary2.federalTax());
        System.out.println(salary2.stateTax());
        System.out.println(salary2.salaryAfterTax());
        System.out.println(salary2.Salary());


    }
}
