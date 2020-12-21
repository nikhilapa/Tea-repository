import java.util.Scanner;

public class scann 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter max no. of stars");
		int max=sc.nextInt();
		System.out.println("enter no.s of space in 1st row");
		int space=sc.nextInt();
		System.out.println("enter no. of * in 1st row");
		int star=sc.nextInt();
		
		for(int i=1; i<=max; i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}	
			for(int j=1; j<=star; j++)
			{
			System.out.print("*");
			}
	
	
			System.out.println();
			space--;
			star++;
			
		 }
		for(int i=1; i<=(max-1); i++)
		{
			for(int j=1;j<=(space+2);j++)
			{
				System.out.print(" ");
			}	
			for(int j=1; j<=(star-2); j++)
			{
			System.out.print("*");
			}
	
	
			System.out.println();
			space++;
			star--;
			
		 }
		
		
		
		}
		
}
