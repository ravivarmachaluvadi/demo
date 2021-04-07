package com.example.h2db.demo.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class Main3 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

        list.add("Ravi");
        list.add("Mahesh");
        list.add("Manish");

        list.stream().filter(s -> s.startsWith("Ma")).forEach(System.out::println);

    }


    public void withDraw(int value){

        //100 -> 100 notes ->p1
        //500 -> 200 notes ->p2



        Map<Integer,Integer> valueCountMap= new HashMap<>();

        valueCountMap.put(100,100);
        valueCountMap.put(500,200);

        if(valueCountMap.get(100)*100>=value){
            int count=value/100;
            Integer integer = valueCountMap.get(100)-count;
            valueCountMap.put(100,integer);
        }
       else if(valueCountMap.get(100)*100>=value){
            int count=value/100;
            Integer integer = valueCountMap.get(100)-count;
            valueCountMap.put(100,integer);
        }


    }
}
