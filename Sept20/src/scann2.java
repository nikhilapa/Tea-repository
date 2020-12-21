import java.util.Scanner;

public class scann2
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		//System.out.println("program?");
		//String title=sc.next();
		System.out.println("enter no. of rows");
		int rows=sc.nextInt();
		System.out.println("enter no.s of space in 1st row");
		int space=sc.nextInt();
		System.out.println("enter no. of * in 1st column");
		int star=sc.nextInt();
		for(int i=1; i<=rows; i++)
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
			space++;
			star--;
			
		 }
		for(int i=1; i<=(rows-1); i++)
		{
			for(int j=1;j<=(space-2);j++)
			{
				System.out.print(" ");
			}	
			for(int j=1; j<=(star+2); j++)
			{
			System.out.print("*");
			}
	
	
			System.out.println();
			space--;
			star++;
			
		 }
		
		
		}

}
