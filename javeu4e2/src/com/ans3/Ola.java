package com.ans3;

public class Ola {
    public Car bookCar(int numberofpassenger, int numberofkms){
            if(numberofpassenger>3){
                Car s = new Sedan();
                s.setNumberofpassenger(numberofpassenger);
                s.setNumberofkms(numberofkms);
                return s;


            }
            else{
                Car h = new HatchBack();
                h.setNumberofkms(numberofkms);
                h.setNumberofpassenger(numberofpassenger);
                return h;

            }
    }
    public int calCulateBill(Car car){
        int total=0;
        if(car instanceof HatchBack){
            HatchBack h= (HatchBack) car;
            total = car.getNumberofkms() *h.fareperkm;
        }
        else{
            Sedan s = (Sedan) car;
             total = car.getNumberofkms() *s.fareperkm;
        }
        return total;
    }
}
