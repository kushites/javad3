package com.day3;

public class WeatherCheck {
    public static void main(String[] args){
        boolean isSnowing = false;
        boolean isRaining= false;
        double Temperature = 60.00;
        if(isRaining||isSnowing||Temperature<50){
            System.out.println("Let's stay home");
        }
        else{
            System.out.println("Let's go out!");
        }
    }
}
