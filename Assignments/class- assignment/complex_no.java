

import java.util.Scanner;


public class complex_no {

    public static void main(String[] args) {
     
        
        Complex c1=new Complex(4,5);

        c1.display();
        
    }
}

 class Complex
 {
	
int real;
	
int imaginary;
  
  
Complex(int x,int y)
{
		
real=x;
		
imaginary=y;	
	
}
	

void display()

{

System.out.println("complex no is:" + real + "+"+imaginary+"i");

}
}
    