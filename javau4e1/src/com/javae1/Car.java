package com.javae1;

import java.io.Serializable;

public class Car implements Serializable {
   private String model;
   private String companyName;
  private  String Color;
    private Engine engine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    class Engine{
      private  int rmp;
    private    int Power;
      private  String manufacturer;
     private   Boolean hasTurbo;
        void enTurbo(boolean a){
           this.hasTurbo=a;

        }
    }

    Car(String model, String companyName, String color, int rpm, int power, String engineman,boolean a){
        Engine d= new Engine();
        Car d1=new Car();
        this.model=model;
        this.companyName=companyName;
        this.Color=color;
        d.rmp=rpm;
        d.Power=power;
        d.manufacturer=engineman;
        d.enTurbo(a);
        System.out.println("Car Model: "+getModel());
        System.out.println("Car companyName: "+getCompanyName());
        System.out.println("Car Color: "+getColor());
        System.out.println("Car RPM: "+d.rmp);
        System.out.println("Car Power: "+d.Power);
        System.out.println("Car Engine manufacturer: "+d.manufacturer);
        System.out.println("Car Has Turbo: "+d.hasTurbo);
    }
    Car(){

    }
}
