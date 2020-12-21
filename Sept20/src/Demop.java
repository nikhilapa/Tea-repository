import java.util.Scanner;

public class Demop {
	
	 public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");
	String a=sc.next();
	System.out.println("enter 2 number:");
	String b=sc.next();

	int num1=Integer.parseInt(a,2);
	int num2=Integer.parseInt(b,2);
	int num3=num1+num2;

	System.out.println(Integer.toBinaryString(num3));
	}
	}

