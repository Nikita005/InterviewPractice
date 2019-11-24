package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/*
Consider a website , we have to track the word searches of that web site and return the most frequently used searched word.
 */

public class MostFrequentlyUsed {

    public static String FrequentWords(ArrayList<String> str) {
        Map<String, Integer> freqMap = new HashMap<>();
        int count = 0;
        Map.Entry<String, Integer> entry = null;

        for (String strList : str) {

            if (freqMap.containsKey(strList)) {
                freqMap.put(strList, count + 1);
            } else {
                freqMap.put(strList, 0);
            }



            for (Map.Entry<String, Integer> mapEntry : freqMap.entrySet()) {
                if (entry == null || mapEntry.getValue().compareTo(entry.getValue()) > 0) {
                    entry = mapEntry;


                }

            }


        }

        return entry.getKey();
    }

    public static void main(String[] args) {

        ArrayList<String> strlist= new ArrayList();

        strlist.add("Hello");
        strlist.add("world");
        strlist.add("hello");
        System.out.println(FrequentWords(strlist));

    }



}




