package com.ans2;

public class HistoryStudent extends Student {
    int historymarks;
    int civicsmarks;

    @Override
    void getPercentage() {
       float total= (historymarks+civicsmarks)*100/200;
        System.out.println("The Percentage of Student: "+total);



    }


}
