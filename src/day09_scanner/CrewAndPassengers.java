package day09_scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int number = 100;

        String total =(number==50||number==75||number==100)?(number==50)?"20 crew, 30 passengers"
                :(number==75)?"25 crew, 50 passengers" :"30 crew, 70 passengers":"invalid";
        System.out.println(total);

        System.out.println("-----------------------");

        int n = 50;
        String result2= "";

        switch (n){
            case 50:
                result2= "20 crew, 30 passengers";
                break;
            case 75:
                result2= "25 crew, 50 passengers";
                break;
            case 100:
                result2= "30 crew, 70 passengers";
                break;
            default:
                result2= "invalid";
        }
        System.out.println(result2);












    }
}
