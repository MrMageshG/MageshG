	import java.util.Scanner;
  class LargNum
  {
  public static void main (String[] args) 
	{
	 int num1, num2 , num3 ;
	 Scanner s=new Scanner(System.in);
	 num1=s.nextInt();
	 num2=s.nextInt();
	 num3=s.nextInt();

      if( num1 >= num2 && num1 >= num3)
      {
          System.out.println(+num1);
}
      else if (num2 >= num1 && num2 >= num3)
      {
          System.out.println(+num2);
}
      else
      {
          System.out.println(+num3);
  }
}
}
