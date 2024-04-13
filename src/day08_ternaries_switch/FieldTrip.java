package day08_ternaries_switch;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 7;

        String location = "Unknown";
        int numOfGroups = 0;
        String teacher ="Unknown";


        if(grade>=1&&grade<=6){
            if(grade==1){
                location= "Apple";
                numOfGroups= 3;
                teacher="ms smith";

            } else if (grade==2) {
                location= "zoo";
                numOfGroups=3;
                teacher="mr lee";
            } else if (grade==3) {
                location="aquarium";
                numOfGroups=5;
                teacher="ms wilson";
            } else if (grade==4) {
                location="movie";
                numOfGroups=2;
                teacher="ms reyes";
            } else if (grade==5) {
                location="museum";
                numOfGroups= 5;
                teacher="ms lela";
            }else{
                location = "Six flags";
                numOfGroups = 6;
                teacher = "Mr Watt";
            }


        }

        System.out.println("local-"+ location);
        System.out.println("number of groups-"+numOfGroups);
        System.out.println("teacher in charge-"+teacher);










    }
}
