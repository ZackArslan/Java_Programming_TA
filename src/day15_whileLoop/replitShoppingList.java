package day15_whileLoop;

import java.util.Scanner;

public class replitShoppingList {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        String shoppingList="";
            int count=1;
                 for (int i = 0; i < count; i++) {
                    if(i>count)
                        count=i;
        }
        double cost = 0;
        System.out.println("Enter the name of item "+count++);
        String itemName=input.next();
        shoppingList+=itemName;
        System.out.println("Enter the price of "+itemName);
        double price=input.nextDouble();
       // shoppingList+=price;
        System.out.println("How many "+itemName+" will you buy?");
        int quantity= input.nextInt();
        shoppingList+=" x "+quantity+" = "+price*quantity+"\n";
        cost +=price*quantity;
        System.out.println("Do you want to add more items to the shopping list?");
        String answer=input.next().toLowerCase();
        while(answer.equals("yes")){
            System.out.println("Enter the name of item "+count++);
            itemName=input.next();
           // shoppingList=itemName;
            System.out.println("Enter the price of "+itemName);
            price=input.nextDouble();
           // shoppingList+=price;
            System.out.println("How many "+itemName+" will you buy?");
            quantity= input.nextInt();
         //   shoppingList+=quantity;
            System.out.println("Do you want to add more items to the shopping list?");
            answer=input.next().toLowerCase();
            shoppingList+=itemName+" x "+quantity+" = "+quantity*price+"\n";
            cost +=price*quantity;
        }
            if(answer.equals("no")){
                System.out.println("SHOPPING LIST: \n"+shoppingList+"\n"+"Total cost: "+cost);
            }
    }
}