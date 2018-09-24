import java.util.Scanner;
class Odd&Even
{
public static void main (String[] args) 

{
	
int m;
        
Scanner s = new Scanner(System.in);
        
m = s.nextInt();
        
if(m % 2 == 0)
        
{
            
System.out.println("Even");
        
}
        
else if(m<0)
        
{
            
System.out.println("invalid");
	
}
    else
    {
	    System.out.println("Odd");
 }
}
}
