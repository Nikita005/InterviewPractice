package com.interview;

import java.util.LinkedHashMap;
import java.util.Map;
/*
LRU - Lease Recently Used Data. In this program we are creating a cache based on LRU algorithm.
1. Initially capacity of the cache will be given. Cache can store the data of its capacity even then if we try to store the data it will delete the least recently used data and it will insert the latest data.
2. When we create an object to the LRUCacheLeetCode with capacity, it will create Linkedhashmap with the given capacity.
3. When the cache is full and when we try to insert the data set()method will internally calls the overided removeEldestEntry() and checks the size of the map with capacity, if the size of the map is greater than capacity then it will delete the least recently used data

public class LRUCacheLeetCode {


    private int capacity;
    LinkedHashMap<Integer,Integer> map;

    public LRUCacheLeetCode(int capacity){
        this.capacity=capacity;
        this.map= new MyMap(capacity);
    }

    public int get(int key){
        Integer val= map.get(key);
        return val ==null ? -1 : val;
    }

    public void set(int key, int value){
        map.put(key,value);
    }

    public static void main(String[] args) {

        LRUCacheLeetCode lru= new LRUCacheLeetCode(3);

        lru.set(1,2);
        lru.set(3,4);
        System.out.println(lru.get(1));

        lru.set(5,6);
        lru.set(8,9);
        System.out.println(lru.get(1));
        System.out.println(lru.get(3));
        lru.set(7,8);
    }
}

 class MyMap extends LinkedHashMap<Integer,Integer> {
    int capacity;
     MyMap(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> map){
        return size()>capacity;
    }
}



