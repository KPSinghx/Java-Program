/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author KPSingh
 */
public class JavaProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<String, String>();
    myMap.put("1", "One");
    myMap.put("2", "Two");
    myMap.put("3", "One");
    myMap.put("4", "Three");
    myMap.put("5", "Two");
    myMap.put("6", "Three");

    Set<String> mySet = new HashSet<String>();

    for (Iterator itr = myMap.entrySet().iterator(); itr.hasNext();)
    {
        Map.Entry<String, String> entrySet = (Map.Entry) itr.next();

        String value = entrySet.getValue();

        if (!mySet.add(value))
        {
            itr.remove();               
        }
    }
    
    System.out.println("mymap :" + myMap);
    }
    
}
