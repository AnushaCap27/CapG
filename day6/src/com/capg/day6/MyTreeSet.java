package com.capg.day6;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

 

public class MyTreeSet {
public static void main(String[] args) {
    
    //it store the data in sorted order
    //Collections.reserveorder()
    TreeSet<Integer> ts=new TreeSet<Integer>(Collections.reverseOrder());
    ts.add(10);
    ts.add(1);
    ts.add(100);
    ts.add(50);
    
    // ts.descendingIterator();
     //HashSet<Integer> hs=(HashSet<Integer>) ts.descendingSet();
    
     //ts.
     
    System.out.println(ts);
}
}

