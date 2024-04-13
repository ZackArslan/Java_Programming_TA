package day08_ternaries_switch;

public class Elevator {
    public static void main(String[] args) {

        int floorNum = 2;
        String result = "Invalid Floor";

        if(floorNum>=1&&floorNum<=3){
            result = "Floor" + floorNum+" is selected. Companies :";
            if(floorNum==1){
                result+= "Lobby, Verizon , Starbucks";
            } else if (floorNum==2) {
                 result+= "Cybertek, NASA, Intelsat";
            }else{
                result+= "Lyft , BofA, Stake House";
            }


        }


        System.out.println(result);











    }
}
