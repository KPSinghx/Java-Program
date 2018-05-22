/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author KPSingh
 */
public class InsertSort {
     public static void main(String[] args) {
        int[] numbers=new int[]{10,9,8,7,5,4,3,2,1};
        InsertSort bubble=new InsertSort();
        List<Integer> list=new ArrayList<>(numbers.length);
        for(int number:numbers){
               list.add(number);
           }
       list= bubble.insertSort(list);
        System.out.println(""+numbers.toString());
           for(int number:list){
               System.out.println(""+number);
           }     
    }
    public static List<Integer> insertSort(final List<Integer> numbers) {
        final List<Integer> sortedList = new LinkedList<>();
        originalList:
        for (Integer number : numbers) {
            for (int i = 0; i < sortedList.size(); i++) {
                if (number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue originalList;
                }
            }
            sortedList.add(sortedList.size(), number);
        }
        return sortedList;
    }
}
