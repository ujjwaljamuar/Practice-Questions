
import java.util.*;
public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0L) {
            System.out.println("Invalid Value");
            return;
        }

        long days = minutes/1440L;
        long years = days/365L;
        long remainingDays = days % 365L;

        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Minutes : ");
        int min=sc.nextInt();
        MinutesToYearsDaysCalculator.printYearsAndDays(min);
        
        sc.close();
    } 
}
