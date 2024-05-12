package day18_garbageCollection;

public class pizza {

    public char size;
    public int cheese;
    public int pepperoni;

    public void setInfo(char size, int cheese, int pepperoni) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
    }

    public double calcCost(){
        double totalPrice=0;

       switch (size){
           case 'S':
           case 's':
               totalPrice=10+2*(cheese+pepperoni);
               break;
           case 'M':
           case 'm':
               totalPrice=12+2*(cheese+pepperoni);
               break;
           case 'L':
           case 'l':
               totalPrice=14+2*(cheese+pepperoni);
               break;
           default:
               System.err.println("Invalid size: "+size);
       }

        return totalPrice;
    }

    public String toString() {
        return "pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", total price=" + calcCost()+
                '}';
    }
}
