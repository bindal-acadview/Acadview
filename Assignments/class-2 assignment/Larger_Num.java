import java.util.Scanner;

public class Larger_Num
{

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = in.nextInt();
        System.out.println("Enter the number ");
        int y = in.nextInt();
        System.out.println("Enter the number ");
        int z = in.nextInt();
      
        if (x>=y && x>=z)
            System.out.println("largest number is "+ x);
           else if (y>=x && y>=z)
            System.out.println("largest number is "+ y);
            else 
            System.out.println("largest number is "+ z);

s1.close();
    }
}