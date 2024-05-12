package day17_customClass;

public class TestStudentObject {
    public static void main(String[] args) {

        Student student1=new Student();
        student1.setInfo("Tilbe",'F',27,"T96",4.5,true);

        Student student2=new Student();
        student2.setInfo("Zack",'M',28,"Z96",4.9,false);

        Student student3=new Student();
        student3.setInfo("Max",'M',40,"M70",3.2,true);

        student1.study();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);



    }
}
