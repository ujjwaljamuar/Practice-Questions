package Array.MinElementChallenge;
import java.util.*;
public class Main {

    private static Scanner sc=new Scanner(System.in);

    private static int[] readIntegers(int count){
        int[] array=new int[count];
        for(int i=0;i<array.length;i++){
            System.out.println("Eneter a number : ");
            int number=sc.nextInt();
            sc.nextLine();
            array[i]= number;
        }
        return array;
    }

    private static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            int value=array[i];
            if(value<min){
                min=value;
            }
        }
        return min;

    }
    public static void main(String[] args) {
        System.out.println("Enter Count : ");
        int count=sc.nextInt();
        sc.nextLine();

        int[] returnedArrays=readIntegers(count);
        int returnedMin=findMin(returnedArrays);

        System.out.println("Min = "+returnedMin);
    }
}
