import java.util.Scanner;
class PrimrorNot
{
public static void main (String[] args) 	
{
		
int r,sum=0,t;    
  
int n;
 
Scanner s=new Scanner(System.in);
 n=s.nextInt();
  
t=n;    
 
 while(n>0)
{    
   
r=n%10;  
   
sum=(sum*10)+r;    
   
n=n/10;   

  }
    
  if(t==sum)
{    
   
System.out.println("Yes ");  
}  
 
 else  
{  
   
System.out.println("no");  
}  

}  

}  
