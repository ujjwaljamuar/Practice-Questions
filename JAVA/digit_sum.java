
import java.util.*;
public class digit_sum {
    public static int sumDigit(int num){
        if(num<10){
            return -1;
        }
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;     //sum=sum+digit;

            num/=10;    // num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num ");
        int n=sc.nextInt();
        System.out.println("sum of digit is "+sumDigit(n));
        

        sc.close();
    }
    
}
