import java.util.*;
import java.lang.*;
class paranthesis{

	public static void main(String args[])
	{

		Scanner s= new Scanner(System.in);
		String text=s.nextLine();
		Stack<String> stack= new Stack<String>();
		try{
		for(int i=0;i<text.length();i++)
		{
			String x= text.substring(i,i+1);

			// System.out.println(x);
			if(x.equals("("))
				{
					stack.push(x);

				}
			else if(x.equals(")")&& stack.size()!=0)
			{
				
					stack.pop();
	
			
			}

			else if(stack.isEmpty()&& x.equals(")"))
			{
				System.out.println("invalid");
				System.exit(0);
				
			}

			if(stack.isEmpty() && i==text.length()-1 )
			{
				System.out.println("valid");
			}

			if(stack.size()!=0 &&  i==text.length()-1)
				System.out.println("invalid");


		}
	
			
		}catch (EmptyStackException e) {}
      }
		

	}

