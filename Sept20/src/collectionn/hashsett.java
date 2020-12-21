package collectionn;

import java.util.HashSet;
import java.util.Iterator;

public class hashsett
{
	public static void main(String[] args) 
	{
	HashSet<Comparable> h1= new HashSet<Comparable>();	
	h1.add("ashish");
	h1.add("avinash");
	h1.add("saurabh");
	h1.add("nikhil");
	h1.add(null);
	h1.add(500);
	h1.add('i');
	System.out.println(h1);
	h1.remove('i');
	System.out.println(h1);
	System.out.println(h1.contains("saurabh"));
	Iterator<Comparable> itr =h1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println(h1.size());
	h1.clear();
	System.out.println(h1);
	
	
	
	
	}

}
