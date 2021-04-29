import java.util.Scanner;

public class NumberPalindrome {
    public static void isPalindrome(int number) {
        int reverse = 0;
        int copyNumber = number;
        int digit = 0;
        while (number != 0) {
            digit = number % 10;
            reverse = (reverse * 10) + digit;
            number /= 10;
        }
        if(reverse == copyNumber){
            System.out.println("Is Palindrome.");
        } 
        else{
            System.out.println("Not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n =sc.nextInt();
        NumberPalindrome.isPalindrome(n);

        sc.close();
    }
}
