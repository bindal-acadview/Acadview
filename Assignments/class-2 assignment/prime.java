
import java.util.Scanner;

public class prime{

    public static void main(String[] args) {
        int num,count=0;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number ");
        num=s1.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            
            }
        }
        if(count==2)
        {
            System.out.println(" number is a prime no");
        }
        else{
           
        System.out.println("Number is not prime");
        }
        s1.flush();
        s1.close();
    }
    
}