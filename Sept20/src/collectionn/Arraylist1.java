package collectionn;

import java.util.ArrayList;

public class Arraylist1
{
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> al=new ArrayList<Comparable>();
		al.add(1);
		al.add("ashish");
		al.add("avinash");
		al.add("saurabh");
		al.add("kajal");
	
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.remove(0));
		System.out.println(al);
		System.out.println(al.contains("ashish"));
		System.out.println(al.get(0));
		al.set(0,"nikhil");
		System.out.println(al);
		
		
	}

}
