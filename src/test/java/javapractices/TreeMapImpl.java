package javapractices;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {
		TreeMap<Integer, String> employee = new TreeMap<Integer, String>();

		employee.put(1234567890, "madhuri");
		employee.put(1234567891, "priyanka");
		employee.put(1234567892, "yogyashri");
		employee.put(1234567893, "amruta");
		employee.put(1234567894, "kiran");
		employee.put(1234567895, "madhuri");

		employee.put(1234567893, "amruta bidri");

		// employee.put(null, "madhuri");

		// entry set
		Set<Entry<Integer, String>> s = employee.entrySet();

		Iterator<Entry<Integer, String>> it = s.iterator();

		for (Entry<Integer, String> e : s) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}

		while (it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey() + " : " + e.getValue());

		}

	}

}
