package com.ans2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmployeeBonus {
    double getBonus(String jd) throws InvalidAgeExceptions {


           DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
           LocalDate ld = LocalDate.parse(jd,dt);
           long jdn= ChronoUnit.YEARS.between(ld,LocalDate.now());
           if(0>jdn){
               InvalidAgeExceptions id = new InvalidAgeExceptions("Date should not be from future");
               throw id;



           }
           else if(1>jdn){
               return 5000;

           }
           else if(1==jdn){
               return 8000;
           }
           else if(2<=jdn){
               return 10000;
           }
           else{

               return 0;
           }



    }

}
