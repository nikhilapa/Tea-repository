package sample1;

public class demo3 
{
	public static void v1()
	{
		int i = 91;
		System.out.println("ISD code for india is +"+i);
	}
	public void v2()
	{
		int s = 2186;
		System.out.println("STD code for P'pur is 0"+s);
	}
	public static void main(String[] args) 
	{
		//Static method call from same class
		v1();
		// Non-static method call from same class 
		demo3 d = new demo3();
		d.v2();
		//Static method call from other class
		demo2.v1();
		// Non-static method call from other class 
		demo2 d2 = new demo2();
		d2.v2();
		
		
	}

}
