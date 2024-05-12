package day18_garbageCollection;

public class bankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "bankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: "+balance);
    }

    public void deposit(double amount){
        if(amount<1){
            System.err.println("Invalid amount: "+amount);
            return;
        }

        balance+=amount;
    }


    public void withDraw(double amount){

        if(amount>balance){
            System.err.println("Invalid amount: "+amount);
            return;
        }
        balance-=amount;
    }



}
