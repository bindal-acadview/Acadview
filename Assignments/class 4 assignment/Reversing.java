
import java.util.Scanner;


public class Reversing
{

    public static void main(String[] args) 
    {
        
        int num,rev=0,rem;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number");
        num=s1.nextInt();
        while(num>0)
        {
           rem =num%10;
           rev=rev*10+rem;
           num=num/10;
           
        }
        System.out.println(rev);


    }

    
}