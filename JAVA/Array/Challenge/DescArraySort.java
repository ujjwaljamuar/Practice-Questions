package Array.Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class DescArraySort {
    private static Scanner sc=new Scanner(System.in);

    public static int[] getIntegers(int capacity){
        int[] array=new int[capacity];
        System.out.println("Enter "+capacity+" integer values : \r");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        return array;
        
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("Elements "+i+ " contents " + array[i]);
        }
    sc.close();
    }

    public static int[] sortIntegers(int[] array){
        // int[] sortedArray=new int[array.length];
        // for(int i=0;i<array.length;i++){
        //     sortedArray[i]=array[i];
        // }

        int[] sortedArray=Arrays.copyOf(array, array.length);    

        boolean flag=true;
        int temp;

        while(flag){
            flag=false;

            // element=0 , 50, 160
            //  50<160 -> swap 

            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        int[] myIntgers=getIntegers(5);
        int[] sorted=sortIntegers(myIntgers);
        printArray(sorted);
    }
    
}
