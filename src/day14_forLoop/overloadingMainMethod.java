package day14_forLoop;

public class overloadingMainMethod {
    public static void main(String[] args) {
        System.out.println("A");  //gets excutided because main method its this one
    }
    public static void main(int[]args){
        System.out.println("B");
    }
    public static void main(double[]args){
        System.out.println("C");
    }
    public static void main(boolean[]args){
        System.out.println("D");
    }
}
