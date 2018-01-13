import java.util.*;

public class reverseOfString {
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("String:");
	String input = s.nextLine();
	  String arr[]= input.split(" ");
       for (int i=arr.length-1;i>-1;i--)
       {
          System.out.print(arr[i]+"  ");
       }


}
}