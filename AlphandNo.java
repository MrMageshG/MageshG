	import java.util.Scanner;
  class AlphandNo
  {
  public static void main(Strng[] args)
  {
  char ch;
        Scanner scan = new Scanner(System.in);
		
       ch = scan.next().charAt(0);
		
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print("No");
        }
        
    }
  }
