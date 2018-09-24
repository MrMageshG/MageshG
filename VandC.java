import java.util.Scanner;
class VandC
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
int i=0;
	Scanner s=new Scanner(System.in);
           char ch=s.next( ).charAt(0);	 
         switch(ch)
	{
	 case  'a' :
	 case 'e'  :
	 case 'i'   :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'   :
	 case 'O'  :
	 case 'U'  :i++;
	}
	if(i==1)
	System.out.println("Vowel");
	else 
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Consonant");
		else
		System.out.println("invalid");		
	}
}
