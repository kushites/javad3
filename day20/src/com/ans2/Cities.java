package com.ans2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("mumbai");
        list.add("delhi");
        list.add("bhopal");
        list.add("nainital");
        list.add("nasik");
       Collections.sort(list, (s1,s2)->s2.compareTo(s1));
        for(String s: list){
            System.out.println(s);
        }

    }
}
