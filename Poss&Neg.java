\\put header file
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

        else
        
{
            
System.out.println(number+" is neither positive nor negative");
        
}
	
}

