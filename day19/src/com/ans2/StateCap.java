package com.ans2;

import java.util.LinkedHashMap;
import java.util.Map;

public class StateCap {
    public static void main(String[] args) {
        LinkedHashMap<String,String> sc= new LinkedHashMap<>();
        sc.put("Rajasthan", "Jaipur");
        sc.put("Gujarat", "Ahmedabad");
        sc.put("Uttar Pradesh", "Lucknow");
        sc.put("Madhya Pradesh", "Bhopal");
        sc.put("Karnataka", "Bangalore");
        for(Map.Entry<String, String>s: sc.entrySet()){
            System.out.println(s.getKey()+" = "+s.getValue());
        }
    }
}
