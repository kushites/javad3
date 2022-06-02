package com.ans2;

public class ScienceStudent extends Student{

    int physicsmarks;
    int mathmarks;
    int chemistrymarks;
    @Override
    void getPercentage() {
     float total =((physicsmarks+mathmarks+chemistrymarks)*100)/300;
        System.out.println("Total Percentage of Student: "+total);
    }
}
