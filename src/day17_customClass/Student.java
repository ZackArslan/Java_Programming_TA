package day17_customClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public String id;
    public double grade;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, String id, double grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void study(){
        System.out.println(name+" "+gender+" "+age+" "+id+" "+grade+" "+isFullTime+" study");
    }

    /*
    Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()

     */
}
