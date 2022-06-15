package com.ans1;

import java.util.*;

public class Compbymarks  {
    public static <hm> Map<String,Student> sortbymarks(Map<String, Student>hm)  {
        List<Integer>list = new ArrayList<>();
        for(Map.Entry<String,Student>s : hm.entrySet()){
            list.add(s.getValue().getMarks());

        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return 1;
                }
                else if(o1<o2){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
        LinkedHashMap<String,Student> sorted= new LinkedHashMap<String, Student>();
        for(Integer s : list){
            for(Map.Entry<String, Student>so: hm.entrySet()){
                Student s1= so.getValue();
                if(s==s1.getMarks()){
                    sorted.put(so.getKey(),so.getValue());
                }
            }
        }

        return sorted;
    }
}
