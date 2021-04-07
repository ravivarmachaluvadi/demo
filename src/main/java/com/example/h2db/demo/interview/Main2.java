package com.example.h2db.demo.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        int[] input={3,4,7,1,2,9,8};

        HashMap<Integer, List<String>> sumMap= new HashMap();

        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if(sumMap.containsKey(input[i]+input[j])){
                    sumMap.get(input[i]+input[j]).add(input[i]+","+input[j]);
                }
                else if (!sumMap.containsKey(input[i]+input[j])){
                    List<String> list=new ArrayList<>();
                    list.add(input[i]+","+input[j]);
                    sumMap.put(input[i]+input[j],list);
                }
            }
        }
        System.out.println(sumMap.size());
        sumMap.forEach((integer, strings) -> System.out.println("sumValue : "+integer +" Possible Pairs : "+strings));
    }
}
