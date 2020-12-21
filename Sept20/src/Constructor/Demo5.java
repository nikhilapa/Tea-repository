package Constructor;

public class Demo5 {
	// 3. user defined- with parameter constructor
		public static void main(String[] args) {

			Demo6 d6 = new Demo6(20, "xyz");
			d6.test();
			
	//User defined without parameter constructor 
			Demo6 d7 = new Demo6();
			d7.test();
			
		}
}
