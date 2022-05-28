package com.ans2;

public class Hosteller extends Student {
        double hostelFee=1000;
        @Override
                double payFee(){
                return examfee+hostelFee;
        }
        Hosteller(int id, String name, int fee){
                super(id,name,fee);
        }
}
