package com.ans2;

public class DayScholar extends Student{
    double transportFee=500;
    @Override
          double payFee(){
        return examfee+transportFee;
    }
    DayScholar(int studid,String name, int examfee){

        super(studid,name,examfee);



    }

}
