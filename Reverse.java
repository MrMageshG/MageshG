	import java.util.Scanner;
  class Reverse
  {
  public static void main (String[] args) throws java.lang.Exception
	{
	
Scanner read = new Scanner(System. in); 
String str = read.nextLine();
String reverse = "";
for(int i = str. length() - 1; i >= 0; i--)
{
reverse = reverse + str. charAt(i);
}	
 System.out.println(reverse);
        		
	}
}
