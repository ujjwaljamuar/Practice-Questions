package Array;

import java.util.Scanner;

public class Arays {

    public static Scanner sc=new Scanner(System.in);

    public static int[] getIntegers(int num){
        System.out.println(" Enter "+num+" integer value \r ");
        int[] values=new int[num];

        for (int i=0; i<values.length;i++){
            values[i]=sc.nextInt();

        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+= array[i];
        }
        return (double) sum/ (double)array.length;
    }
    public static void main(String[] args) {
        
        int[] myIntgers=getIntegers(5);
        for(int i=0;i<myIntgers.length;i++){
            System.out.println("Element "+i+ " typed value was "+myIntgers[i]);
        }

        System.out.println("Average is "+getAverage(myIntgers));
        /* int[] intArray=new int[26]; // size of the array (number of elements).
        // intArray[0]= 50; // index position of the array
        // intArray[1]= 51;

        // int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // another method to initialise

        int[] a1 = new int[10];

        for (int i = 0; i < 10; i++) {
            a1[i] = i * 5;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + " value is " + a1[i]);
        }

        // System.out.println(intArray[0]);
        // System.out.println(intArray[8]);


        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 5;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element " + i + " value is " + intArray[i]);
        }
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Elemen " + i+ " value is "+array[i]);
        }
    }          
        */
    
    


    }
}

