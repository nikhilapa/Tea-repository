package exceptionn;

public class except2 
{
public static void main(String[] args) 
{
	int a=10;
	int b=0;
	int c=0;
	
	try
	{
		c=a/b;
		try
		{
			c=b/a;
		}catch(Exception e1) {
			System.out.println("Except handling");
		}
	}
	catch(Exception e)
	{
		System.out.println("exception handled");
	}
	finally
	{
	System.out.println("Good morning");
	System.out.println(c);
	}
}
}
