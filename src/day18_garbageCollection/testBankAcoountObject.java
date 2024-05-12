package day18_garbageCollection;

public class testBankAcoountObject {
    public static void main(String[] args) {

        bankAccount obj1=new bankAccount();
        obj1.setInfo("Tilbe",123456789);

        obj1.deposit(1000);

        obj1.checkBalance();

        obj1.withDraw(700);

        obj1.checkBalance();


    }
}
