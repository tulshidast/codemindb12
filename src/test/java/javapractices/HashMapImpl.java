package javapractices;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {

		HashMap<Integer, String> employee = new HashMap<Integer, String>();

		employee.put(1234567890, "madhuri");
		employee.put(1234567891, "priyanka");
		employee.put(1234567892, "yogyashri");
		employee.put(1234567893, "amruta");
		employee.put(1234567894, "kiran");
		employee.put(1234567895, "madhuri");

		employee.put(1234567893, "amruta bidri");

		employee.put(null, "madhuri");

		HashMap<Integer, String> employee2 = new HashMap<Integer, String>();

		employee2.putAll(employee);

		// entry set
		Set<Entry<Integer, String>> s = employee.entrySet();

		Iterator<Entry<Integer, String>> it = s.iterator();

		while (it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey() + " : " + e.getValue());

		}

		System.out.println("#############################################");
		// Removes all of the mappings from this map.The map will be empty after this
		// call returns.
		employee.clear();

		System.out.println("Employee after clear method is empty= " + employee.isEmpty());

		// entry set
		Set<Entry<Integer, String>> s1 = employee.entrySet();

		Iterator<Entry<Integer, String>> it1 = s1.iterator();

		while (it1.hasNext()) {
			Entry<Integer, String> e = it1.next();
			System.out.println(e.getKey() + " : " + e.getValue());

		}

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Set<Entry<Integer, String>> e3 = employee2.entrySet();

		for (Entry<Integer, String> e : e3) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		// Returns true if this map contains a mapping for the specified key.
		System.out.println(employee2.containsKey(1234567894));
		System.out.println(employee2.containsKey(243434343));

		System.out.println("############################################");
		System.out.println(employee2.containsValue("priyanka"));
		System.out.println(employee2.containsValue("abcd"));

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		// Returns the value to which the specified key is mapped
		System.out.println(employee2.get(1234567892));

		System.out.println("********************************************");
		// Returns true if this map contains no key-value mappings.
		System.out.println(employee2.isEmpty());

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Set<Integer> keyset = employee2.keySet();

		Iterator<Integer> keys = keyset.iterator();
		while (keys.hasNext()) {
			System.out.println(keys.next());
		}

		System.out.println("********************************************");
		int size = employee2.size();
		System.out.println(size);

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		Collection<String> values = employee2.values();
		for (String value : values) {
			System.out.println(value);
		}

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		employee2.remove(1234567892);
		Set<Entry<Integer, String>> e4 = employee2.entrySet();

		for (Entry<Integer, String> e : e4) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println("###########################################");
		employee2.replace(1234567894, "sachin");

		Set<Entry<Integer, String>> e5 = employee2.entrySet();

		for (Entry<Integer, String> e : e5) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
