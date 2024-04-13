package day07_ifStatementsTA;

public class CappuccinoBuyerTA {
    public static void main(String[] args) {

        double price;
        int calories;
        String size = "Tall";
        String result = "";

        if(size=="Tall" || size=="Grande" ||  size=="Venti"){
            if(size=="Tall"){
            result = "Price = 3.69 \nCalories = 90";
            } else if (size=="Grande") {
                price = 3.99;
                calories = 120;
            }else{
                price = 4.29;
                calories = 150;
            }
        }else{
            System.out.println("invalid size");
        }


        System.out.println(result);



//        if(price<=4.29&&calories<=150){
//            if(price==3.69&&calories==90){
//                size = "tall";
//            } else if (price==3.99&&calories==120) {
//                size = "grande";
//            }else {
//                size = "venti";
//            }
//
//
//        }else {
//            System.out.println("invalid size");
//        }
//        System.out.println(size);










        /*
        Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if

         */








    }




}
