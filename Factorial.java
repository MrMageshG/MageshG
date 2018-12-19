import java.util.Scanner;
  class Factorial
double n,fact=1;
	
Scanner s=new Scanner(System.in);
	
n=s.nextDouble();

 
if(n==0)
	        
{
	        	
System.out.println("1");
	        
}
	        
else
	        
{
	        
 
for(int i=1;i<=n;i++)
	
{
		
fact=fact*i;
	
}
	
System.out.println(+fact);
	
}

}


}
