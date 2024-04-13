package day09_scanner;

public class IfAndSwitch {
    public static void main(String[] args) {

        int number = 75;

        if (number == 50 || number == 75 || number == 100) {

            switch (number) {
                case 50:
                    System.out.println("20 crew,30 passengers");
                    break;
                case 75:
                    System.out.println("25 crew, 50 passengers");
                    break;
                default:
                    System.out.println("30 crew, 70 passengers");
            }

        } else {
            System.out.println("invalid number");
        }

//switch statement = switch ,case, default,break
        // switch(data/variable){
        // case data1:
        //statements;
        //break;
        //default:

        /*
        cannot be boolean float double or long
        value must be unique and must match with switch expressions data type

         */










    }
}
