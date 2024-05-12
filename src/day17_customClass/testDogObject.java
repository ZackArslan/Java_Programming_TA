package day17_customClass;

public class testDogObject {
    public static void main(String[] args) {

       dog dog1= new dog();

       dog1.name="Max";
       dog1.breed="Husky";
       dog1.gender='M';
       dog1.age= 4;
       dog1.size="Large";
       dog1.color= "Gray";

       dog dog2=new dog();

        dog2.name="Daniel";
        dog2.breed="Golden retriever";
        dog2.gender='F';
        dog2.age= 2;
        dog2.size="Small";
        dog2.color= "Gold";

        dog dog3=new dog();

        dog3.setInfo("Loki","Chow chow", "Medium",'M',3,"Black");

        dog dog4=new dog();

        dog4.setInfo("Daisy","Bulldog","Large",'F',5,"White");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);




    }
}
