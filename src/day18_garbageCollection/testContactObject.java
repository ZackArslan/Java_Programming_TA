package day18_garbageCollection;

public class testContactObject {
    public static void main(String[] args) {

        contact contact1=new contact();
        contact1.setInfo("Tilbe",941718879,"tilbemalatya@gmail.com");

        System.out.println(contact1);

        contact1.call();
        contact1.sendEmail();
        contact1.sendMessage();
    }
}
