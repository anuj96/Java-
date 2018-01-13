import java.util.*;
import java.lang.*;

class nameborderPattern
{

public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String name= s.next();
	System.out.println("enter first name ");
	String name1= s.next();
	System.out.println("enter second name ");
	String name2= s.next();

	
	
		
		for (int j=name1.length();j>0 ;j--)
		 {
			
		
			System.out.println(name1.substring(0,j));
			
		 }
		 for (int j=2;j<name1.length()+1 ;j++)
		 {
			
		
			System.out.println(name1.substring(0,j));
			
		 }




		 for (int j=name2.length();j>0 ;j--)
		 {
			
		
			System.out.println(name2.substring(0,j));
			
		 }
		 for (int j=2;j<name2.length()+1 ;j++)
		 {
			
		
			System.out.println(name2.substring(0,j));
			
		 }
		 	
		 	
	
	
}

}