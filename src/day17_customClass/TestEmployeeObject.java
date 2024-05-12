package day17_customClass;

public class TestEmployeeObject {
    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.setInfo("Tilbe",27,'F',"Engineer",100000,"T27");

        Employee employee2=new Employee();
        employee2.setInfo("Zack",27,'M',"QA",150000,"Z27");

        Employee employee3=new Employee();
        employee3.setInfo("Hatice",30,'F',"Maid",50000,"H30");


        employee3.age=50; //we can change variables from this method
        employee1.jobTitle="Developer";

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee2.work();

    }
}
