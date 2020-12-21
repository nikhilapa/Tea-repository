package Constructor;

public class Demo6 {
	int a=1;
	String s;
	
	Demo6()
	{
	a= 5;
	s= "Vel";
	}
     
	// user defined-with parameter
	Demo6(int b, String s1) {
		a = b;
		s = s1;
	}

	public void test() {
		System.out.println(a);
		System.out.println(s);
		System.out.println("running test method");
	}
}
