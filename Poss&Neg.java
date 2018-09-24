import java.util.Scanner;
import java.util.io;
class Poss&Neg
{
publi static void main(String[] args)
{
int number;
		
Scanner s=new Scanner(System.in);
		
number=s.nextInt();
        
if(number > 0)
        
{
            
System.out.println("\nPositive ");
        
}
        
else if(number < 0)
        
{
            
System.out.println("\nNegative");
        
}

else if(number==0)
{
	System.out.println("\nZero");
}
	else
        
{
            
System.out.println(" is neither Positive nor Negative");
        
}
	
}
}
