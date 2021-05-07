package Practice_Questions.FindKey;

import java.util.Scanner;

public class Main {
    public static int findKey(int input1,int input2,int input3){
        int a = input1/10;
        int b= input1/100;
        int c= Math.max(b%10, (Math.max(b/10, (Math.max(input1%10, a%10)))));

        int d = input2/10;
        int e= input2/100;
        int f= Math.max(e%10, (Math.max(e/10, (Math.max(input2%10, d%10)))));

        int g = input3/10;
        int h= input3/100;
        int i= Math.max(h%10, (Math.max(h/10, (Math.max(input3%10, g%10)))));

        int sum=c+f+i;

        int a1 = input1/10;
        int b1= input1/100;
        int c1= Math.min(b1%10, (Math.min(b1/10, (Math.min(input1%10, a1%10)))));

        int d1 = input2/10;
        int e1= input2/100;
        int f1= Math.min(e1%10, (Math.min(e1/10, (Math.min(input2%10, d1%10)))));

        int g1 = input3/10;
        int h1= input3/100;
        int i1= Math.min(h1%10, (Math.min(h1/10, (Math.min(input3%10, g1%10)))));

        int sum1=c1+f1+i1;
        int key=sum-sum1;
        System.out.println("Key is "+key);
        return key;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input1 :");
        int input1=sc.nextInt();

        System.out.println("Input2 :");
        int input2=sc.nextInt();

        System.out.println("Input3 :");
        int input3=sc.nextInt();

        findKey(input1, input2, input3);

        sc.close();
        
    }
}
