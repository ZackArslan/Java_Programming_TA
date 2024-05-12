package day18_garbageCollection;

public class testPizzaObject {
    public static void main(String[] args) {

        pizza pizza1=new pizza();
        pizza1.setInfo('L',2,3);

        pizza pizza2=new pizza();
        pizza2.setInfo('S',1,2);

        System.out.println(pizza1);
        System.out.println(pizza2);


        System.out.println("--------------------------");

        double total=0;

        for (int i = 0; i < 20 ; i++) {

            pizza small=new pizza();
            small.setInfo('S',2,2);
            total+= small.calcCost();

            pizza large=new pizza();
            large.setInfo('L',4,5);
            total+= large.calcCost();


            pizza medium=new pizza();
            medium.setInfo('M',3,4);
            total+= medium.calcCost();


        }
        System.out.println("Total= "+total);





    }
}
