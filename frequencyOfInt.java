import java.util.*;

public class frequencyOfInt {
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	
	int count=0;
	System.out.println("size of the list");
	int size=s.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter your numbers");
	for(int i=0;i<size;i++)
	{
		arr[i]=s.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		count=0;
		for(int j=0;j<size;j++)
		{
			if(arr[j]==i)
			{
				count++;
				
			}
		}
		if(count!=0)
		System.out.println(i+" is "+count+" times");
	}

}
}