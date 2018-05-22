/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram;

/**
 *
 * @author KP Singh
 */
public class Bubble {
    public static void main(String[] args) {
        int[] numbers=new int[]{10,9,8,7,5,4,3,2,1};
        Bubble bubble=new Bubble();
        bubble.bubbleSort(numbers);
        System.out.println(""+numbers.toString());
           for(int number:numbers){
               System.out.println(""+number);
           }     
    }
    
    public void bubbleSort(int [] numbers){
        boolean numberSwitched;
        int temp=0;
        do{
            numberSwitched=false;
            for(int i=0;i<numbers.length-1;i++){
                if(numbers[i+1]<numbers[i]){
                    temp=numbers[i+1];
                    numbers[i+1]=numbers[i];
                    numbers[i]=temp;
                    numberSwitched=true;
                }
            }
            
            
        }while(numberSwitched);
    }
}
