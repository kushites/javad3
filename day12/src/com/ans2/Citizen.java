package com.ans2;

public class Citizen {
    private String name;
    private String aadharnumber;
    private String mobilenumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadharnumber() {
        return aadharnumber;
    }

    public void setAadharnumber(String aadharnumber) {
        this.aadharnumber = aadharnumber;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
    Citizen(){

    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", aadharnumber='" + aadharnumber + '\'' +
                ", mobilenumber='" + mobilenumber + '\'' +
                '}';
    }
}
