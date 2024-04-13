package day09_scanner;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter hourly rate: ");
        double hourlyRate = input.nextDouble();

        System.out.print("Enter hours per week: ");
        int hoursPerWeek = input.nextInt();

        System.out.print("Enter state tax rate (e.g. 7.5 for 7.5%): ");
        double stateTaxRate = input.nextDouble() / 100.0;

        System.out.print("Enter federal tax rate (e.g. 25 for 25%): ");
        double federalTaxRate = input.nextDouble() / 100.0;

        input.close();

        double salary = hourlyRate * hoursPerWeek * 4;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - totalTax;

        System.out.println("Salary: "+ salary);
        System.out.println("State tax: " +stateTax);
        System.out.println("FederalTax: " +federalTax);
        System.out.println("Total tax: " +totalTax);
        System.out.println("Net Income: "+netIncome);
    }




















        /*
        Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
         */
    }

