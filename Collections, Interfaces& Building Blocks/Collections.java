package demo;
import java.util.*;

public class Collections {
	public static void main(String[] args) {
		System.out.println("Array list");
		ArrayList<String>city= new ArrayList<String>();
		city.add("Banglore");
		city.add("Hyderabad");
		System.out.println(city);
		System.out.println("\n");
		System.out.println("Vector List");
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(5);
		vec.add(7);
		vec.add(13);
		System.out.println(vec);
		System.out.println("\n");
		System.out.println("Linked List");
		LinkedList<String> names=new LinkedList<String>();
		names.add("Sashi");
		names.add("Priya");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\n");
		System.out.println("Hashset");
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(34);
		hs.add(45);
		System.out.println(hs);
		System.out.println("\n");
		System.out.println("Linked Hash Set");
		LinkedHashSet<Integer>hs2=new LinkedHashSet<Integer>();
		hs2.add(76);
		hs2.add(35);
		hs2.add(42);
		System.out.println(hs2);	
	}

}
