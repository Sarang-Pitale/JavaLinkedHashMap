package com.sample;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

public class Demo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> num=new LinkedHashMap<>(); // Creation
        num.put(1,"One"); // Add element
        num.put(2,"two");
        num.put(3,"three");
        num.putIfAbsent(3,"Three"); // add if key 3 doesnot Exist
        System.out.println("Map :"+num);
        System.out.println(num.get(2)); // get value with key 2
        System.out.println(num.keySet());// get all Keys
        System.out.println(num.values());// get all values
    }
}
