package day07_ifStatementsTA;

public class NetIncomeCalcTA {
    public static void main(String[] args) {

        int salary = 100000;
        boolean isMarried= true;
        double taxRate = 0;


        if(salary>=130000){
            taxRate = 0.35;
        }
        if(salary>=100000&& salary<130000){
            taxRate = 0.30;
        }
        if(salary >=80000&&salary<100000){
            taxRate = 0.25;
        }
        if(salary<80000){
            taxRate = 0.2;
        }
        if(isMarried){
            taxRate -= 0.05;
        }
        double totalTax = salary * taxRate;
        double netIncome = salary -totalTax;

        System.out.println("NetIncome=" + netIncome);
        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);












    }


}
