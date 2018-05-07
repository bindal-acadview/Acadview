
import java.util.Scanner;

public class palindrome
{
 public static void main(String[] args) {
    

    int num,rev=0,rem;
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter the number to check ");
    num=s1.nextInt();
    int temp=num;
    while(num>0)
    {
       rem =num%10;
       rev=rev*10+rem;
       num=num/10;
       
    }
    if(temp==rev)
    {
        System.out.println("Number is palindrome");
    }
    else
    {
        System.out.println("Number is not palindrome");
    }

    
s1.close();


}

}