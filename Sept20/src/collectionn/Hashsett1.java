package collectionn;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashsett1 
{
	public static void main(String[] args) 
	{
		ArrayList<Comparable> al=new ArrayList<Comparable>();
		al.add(1);
		al.add("ashish");
		al.add("avinash");
		al.add("saurabh");
		al.add("kajal");
		al.add("kajal");
		System.out.println(al);
		HashSet hs= new HashSet(al);
		System.out.println(hs);
		
		
		
	}

}
