				public class classname
        {
        public static void main(String[] args)
        {
        double a,b;
	 Scanner s = new Scanner(System.in);
      System.out.println("\n Enter The First Number");
      a=s.nextdouble();
     System.out.println("\n Enter The Second Number");
      b=s.nextdouble();
      
     System.out.print("Enter an operator (+, -, *, /):\n ");
        char operator =s.next().charAt(0);
        double result;
        switch(operator)
    
        {
            case '+':
                result = a+b;
                 System.out.println("The Result is:"+result);
                break;

            case '-':
                result = a-b;
                 System.out.println("The Result is:"+result);
                break;

            case '*':
                result = a*b;
                 System.out.println("The Result is:"+result);
                break;

            default:
                
                if(b==0)
                {
                	System.out.println("0");
                }
                	else
                	{
                		 result = a/b;
                
                	System.out.println(result);
                	}
                		
               }
             
        }

             
}
	

	
