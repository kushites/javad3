package com.an3;

import java.util.Scanner;

public class IPL {
   void homeTeamStadium(Stadium stadium){

        switch(stadium){
            case EDEN_GARDENS_STADIUM:
                System.out.println("This is Homeground Of KKR");
                break;

            case WANKHEDE_STADIUM:
                System.out.println("This is a Homeground of MUMBAI INDIANS");
                break;
            case CHIDAMBARAM_STADIUM:
                System.out.println("This is the Homeground of CSK");
                break;
            case M_CHINNASWAMY_STADIUM:
                System.out.println("This is the Homeground of RCB");
                break;
            default:
                System.out.println("just play the cricket");


        }
    }

    public static void main(String[] args) {
        IPL ipl = new IPL();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ipl stadium: ");
        String s = sc.next();
        if(s.equals("CHIDAMBARAM_STADIUM") ||s.equals("M_CHINNASWAMY_STADIUM")||s.equals("EDEN_GARDENS_STADIUM")||s.equals("WANKHEDE_STADIUM")){
            Stadium s1 = Stadium.valueOf(s);

            ipl.homeTeamStadium(s1);
        }
        else {

            System.out.println("just play the ipl");
        }
    }
}
