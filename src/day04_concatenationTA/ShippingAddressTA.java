package day04_concatenationTA;

public class ShippingAddressTA {
    public static void main(String[] args) {
        /*
        name
        building number
        street name
        city
        state
        zipcode
        your shipping address is : Aaron Kissinger 13621A Legacy Circle Fairfax, VA 22030
         */

        String name = "Aaron Kissinger",
                streetName = "Legacy Circle",
                city = "Fairfax",
                state = "VA";
        String buildingNumber = "13621A";
        String zipCode = "22030";

        System.out.println("Your Shipping Address is :");
        System.out.println("\t" + name  );
        System.out.println("\t" + buildingNumber+ " " + streetName);
        System.out.println("\t" + city + ", " + state + " " + zipCode);

        System.out.println("Your Shipping Address is:\n\t" + name+ "\n\t" +
                buildingNumber + " " + streetName + "\n\t" + city +", " +  state+" " + zipCode);














    }














}
