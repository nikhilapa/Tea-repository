package collectionn;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashsett 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("ashish");
		lhs.add("avinash");
		lhs.add("nikhil");
		lhs.add("saurabh");
		lhs.add("kajal");
		lhs.add("nikhil");
		System.out.println(lhs);
		lhs.remove("kajal");
		System.out.println(lhs);
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
