package day12_CustomMethods;

public class emailTask {
    public static void main(String[] args) {

        String email= "mike_tyson@gmail.com";
        String firstName= email.substring(0,email.indexOf("_"));
        String lastName= email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain= email.substring(email.indexOf("@"));

        email=lastName+"_"+firstName+domain;

        System.out.println(email);


    }
}
