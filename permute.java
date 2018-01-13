import java.util.*;

public class permute {
public static void main(String[] args)
{
	Scanner s= new Scanner(System.in);
	System.out.println("String: ");
	String text=s.nextLine();
	int str=text.length();
	for(int i=0;i<str;i++)
	{
	  	String first=Character.toString(text.charAt(i));
	   	if(i==0)
	  	{
	  		System.out.println(first+Character.toString(text.charAt(i+1))+Character.toString(text.charAt(i+2)));
	  		System.out.println(first+Character.toString(text.charAt(i+2))+Character.toString(text.charAt(i+1)));
	  		

	  	}
	  	if(i==1)
	  	{
	  		System.out.println(first+Character.toString(text.charAt(i-1))+Character.toString(text.charAt(i+1)));
	  		
	  		System.out.println(first+Character.toString(text.charAt(i+1))+Character.toString(text.charAt(i-1)));
	  	}
	  	if(i==2)
	  	{
	  		System.out.println(first+Character.toString(text.charAt(i-2))+Character.toString(text.charAt(i-1)));

	  		System.out.println(first+Character.toString(text.charAt(i-1))+Character.toString(text.charAt(i-2)));
	  	}
	  	


	}

}
}