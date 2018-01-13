import java.util.*;

class stack{

	public static void main(String args[])
	{

		Stack<String> stack= new Stack<String>();
		stack.push("0");
		Stackprint(stack);
		stack.push("1");
		Stackprint(stack);
		stack.push("2");
		Stackprint(stack);

		stack.pop();
		Stackprint(stack);

		stack.pop();
		Stackprint(stack);

		stack.pop();
		Stackprint(stack);

	}

	private static void Stackprint(Stack<String> s)
	{

		if(s.isEmpty())
			System.out.println("stack is empty");
		else
			System.out.println(s+"top");

	}
}