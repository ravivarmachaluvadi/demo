package com.example.h2db.demo.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Vote for big boss contestants. Assume contestants are named ‘a’ to ‘z’. Votes are coming in the form of array , find the contestant
 having maximum and minimum votes . if no winner is found , print “No Winner” and if no looser is found , print “ no looser!!!”
        Ex:votes = “aaaaabbcccdddd”
        Output: Winner:a
        Looser:b
        */

public class BigBossRealityShow {
    public static void main(String args[]) {

//char [] chArray= {'a','a','a','a','a','b','b','c','c','c','d','d','d','d'};
// char [] chArray= {'a','a','b','b'};
//char [] chArray= {'a','a','b','b','c'};
//char [] chArray= {'a','a','b','b','c','d'};
char []  chArray=null;

        Map<Character,Integer> map = new HashMap();

        if(chArray!=null){
            for(char ch : chArray){
                if(map.containsKey(ch)){
                    int count=map.get(ch);
                    count=count+1;
                    map.put(ch,count);
                }
                else{
                    map.put(ch,0);
                }
                display(map);
            }
        }
        else{
            System.out.println("Value Should not be Null");
        }
    }

    public static void display(Map<Character,Integer> map){

        int minVoteCount =map.values().stream().min(Comparable::compareTo).get();
        int maxVoteCount =map.values().stream().max(Comparable::compareTo).get();

        Set<Character> looserSet=new HashSet();
        Set<Character> winnerSet=new HashSet();

        for (char ch : map.keySet()){

            if(maxVoteCount==minVoteCount){
                System.out.println("No Looser : No Winner");
            }
            else if(map.get(ch)==minVoteCount){
                looserSet.add(ch);
                //  System.out.println("Looser : "+ch);
            }
            else if(map.get(ch)==maxVoteCount){
                winnerSet.add(ch);
                //  System.out.println("Winner : "+ch);
            }
        }

        if(looserSet.size()>1){
            System.out.println("No Looser");
        }
        else{
            System.out.println(" Looser :"+looserSet);
        }
        if(winnerSet.size()>1){
            System.out.println("No Winner");
        }
        else{
            System.out.println(" winnerSet "+winnerSet);
        }
    }
}
