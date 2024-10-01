package javapractices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCharacterestics {

	public static void main(String args[]) {
		Set<String> set = new HashSet<String>();
		set.add("sachin");
		set.add("hardik");
		set.add("virat");
		set.add("ravindra");
		set.add("rohit");
		set.add(null);

		// duplicate
		set.add("hardik");

		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("###############LinkedHashSet#####################");

		Set<String> set1 = new LinkedHashSet<String>();
		set1.add("sachin");
		set1.add("hardik");
		set1.add("virat");
		set1.add("ravindra");
		set1.add("rohit");
		set1.add(null);

		// duplicate
		set1.add("hardik");

		Iterator<String> it2 = set1.iterator();

		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

		System.out.println("##############TreeSet#######################");

		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(30);
		set2.add(1);
		set2.add(20);
		set2.add(50);
		set2.add(40);

		// duplicate
		set2.add(1);

		//set2.add(null);

		Iterator<Integer> it3 = set2.iterator();

		while (it3.hasNext()) {
			System.out.println(it3.next());
		}

	}

}
