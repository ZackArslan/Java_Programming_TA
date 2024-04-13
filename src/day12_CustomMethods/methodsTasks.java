package day12_CustomMethods;

public class methodsTasks {
    /*
    Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
     */
    public static void main(String[] args) {

        emailDomain("tilbe_arslan@gmail.com");
        System.out.println("----------------------------");

    }

    public static void emailDomain(String email){

        int beginning= email.indexOf('@')+1;
        int ending = email.indexOf('.');
        String domain= email.substring(beginning,ending);
        System.out.println(domain);



        }

    }

