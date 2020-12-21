package exceptionn;

public class except1 
{
	public static void main(String[] args) 
	{
		int ar[]=new int[2];
		ar[0]=10;
		ar[1]=24;
		try {
		System.out.println(ar[2]);
		}
		catch(Exception e){
			System.out.println(e);;
		}
		
		System.out.println("array length is"+ar.length);	

	}

}
