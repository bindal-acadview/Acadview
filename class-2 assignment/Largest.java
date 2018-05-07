import java.util.Scanner;

public class Largest
{

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = in.nextInt();
        System.out.println("Enter the number ");
        int b = in.nextInt();
        System.out.println("Enter the number ");
        int c = in.nextInt();
      
        if (a>=b&&a>=c)
            System.out.println("largest number is "+ a);
           else if (b>=a&&b>=c)
            System.out.println("largest number is "+ b);
            else 
            System.out.println("largest number is "+ c);


    }
}