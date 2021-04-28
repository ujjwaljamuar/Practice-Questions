
import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter you name : ");
        String name=sc.nextLine();
        System.out.println("Enter your YearOfBirth : ");
        int year=sc.nextInt();
        int age= 2021- year;

        if (year >0 && age >0 && age<= 100 ){
            System.out.println("Your name is "+name+" and you are "+age+" years old.");
        }
        else{
            System.out.println("Invalid Inputs !");
        }
        sc.close();
    }
    
}
