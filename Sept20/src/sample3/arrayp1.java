package sample3;

import java.util.Arrays;

public class arrayp1 
{
	public static void main(String[] args) 
	{
		String ar[]=new String[4];
		
		ar[0]="avinash";
		ar[1]="saurabh";
		ar[2]="nikhil";
		ar[3]="ashish";
		
		int ai[]= {20,10,40,30};
		
		System.out.print("Before sorting \n");
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
			//System.out.print("");
		}
		
		
		System.out.println("");
		for(int i=0; i<ai.length; i++)
		{
			System.out.print(ai[i]+" ");
			
		}
		
		Arrays.sort(ar);
		Arrays.sort(ai);
		System.out.println("");
		
		System.out.println("After sorting in asc");
		for (int i = 0; i <ar.length; i++)
		{
			System.out.print(ar[i]+" ");
			
		}
		System.out.println("");
		for (int i = 0; i <ai.length; i++)
		{
			System.out.print(ai[i]+" ");
			
		}
		System.out.println("");
		System.out.println("After sorting in desc");
		for (int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
			
		}
		System.out.println("");
		for (int i=ai.length-1; i>=0; i--)
		{
			System.out.print(ai[i]+" ");
			
		}
			
			
		
	}

}
