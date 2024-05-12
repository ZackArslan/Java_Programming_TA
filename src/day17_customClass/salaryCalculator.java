package day17_customClass;

public class salaryCalculator {

    public double hourlyRate;
    public double stateTax;
    public double federalTax;
    public double weeklyHours;

    public void setInfo(double hourlyRate, double stateTax, double federalTax, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTax = stateTax/100;
        this.federalTax = federalTax/100;
        this.weeklyHours = weeklyHours;
    }
    public double Salary(){
        return weeklyHours * hourlyRate *52;
    }
    public double stateTax(){
        return Salary() * stateTax;
    }
    public double federalTax(){
        return Salary() * federalTax;
    }

    public double salaryAfterTax(){
        return Salary()-stateTax() - federalTax();
    }


    public String toString() {
        return "salaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTax=" + stateTax +
                ", federalTax=" + federalTax +
                ", weeklyHours=" + weeklyHours +
                '}';
    }

    /*
     Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object

     */
}
