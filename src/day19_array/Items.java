package day19_array;

public class Items {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int indexOfGloves = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                indexOfGloves = i;
                break;
            }
        }
        System.out.println("Index of Gloves: " + indexOfGloves);

        System.out.println("----------------------------------------------");
        boolean containsIpad = false;
        for (int i = 0; i < items.length; i++) {

            if (items[i].contains("iPad")){
                containsIpad = true;
                break;
            }
        }
        System.out.println("Has iPad: " + containsIpad);

        System.out.println("----------------------------------------------");
        for (int i = 0; i < items.length; i++) {
            String itemName = items[i];
            double itemPrice = prices[i];
            int itemID = itemIDs[i];

            System.out.println(itemName + " - " + itemPrice + " - #" + itemID);
        }

        /*
         Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

         */
    }
}
