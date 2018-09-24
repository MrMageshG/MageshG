\\put header file
public static void main (String[] args) 

{
	
int m;
        
Scanner s = new Scanner(System.in);
        
m = s.nextInt();
        
if(m % 2 == 0)
        
{
            
System.out.println("Even");
        
}
        
else if(m % 3==0)
        
{
            
System.out.println("Odd");
	
}
    else
    {
	    System.out.println("invalid");
 }
}
