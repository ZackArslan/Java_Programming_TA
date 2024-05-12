package day17_customClass;

public class dog {

    public String name;   //instance variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public void setInfo(String name,String breed,String size,char gender,int age,String color){
        this.name = name; // this keyword is used for the instance variable name
        this.breed=breed;
        this.gender=gender;
        this.size=size;
        this.age=age;
        this.color=color;
    }

    public void eat(){
        System.out.println(name+" is eating dog food");
    }
    public void drink(){
        System.out.println(name+" is drinking water");
    }

    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
