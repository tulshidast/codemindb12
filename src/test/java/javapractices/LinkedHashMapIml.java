package javapractices;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapIml {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> employee = new LinkedHashMap<Integer, String>();

		employee.put(1234567890, "madhuri");
		employee.put(1234567891, "priyanka");
		employee.put(1234567892, "yogyashri");
		employee.put(1234567893, "amruta");
		employee.put(1234567894, "kiran");
		employee.put(1234567895, "madhuri");

		employee.put(1234567893, "amruta bidri");

		employee.put(null, "madhuri");

		// entry set
		Set<Entry<Integer, String>> s = employee.entrySet();

		Iterator<Entry<Integer, String>> it = s.iterator();

		while (it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey() + " : " + e.getValue());

		}

	}

}
