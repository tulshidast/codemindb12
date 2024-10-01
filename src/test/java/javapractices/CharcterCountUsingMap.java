package javapractices;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CharcterCountUsingMap {

	public static void main(String[] args) {

		String s = "Welcome to codemind";

		HashMap<Character, Integer> charcterCoutHashMap = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			if (!(charcterCoutHashMap.containsKey(s.charAt(i)))) {
				charcterCoutHashMap.put(s.charAt(i), 1);
			}

			else {
				charcterCoutHashMap.put(s.charAt(i), charcterCoutHashMap.get(s.charAt(i)) + 1);
			}

		}

		Set<Entry<Character, Integer>> set = charcterCoutHashMap.entrySet();

		for (Entry<Character, Integer> ss : set) {
			System.out.println(ss.getKey() + " : " + ss.getValue());
		}
	}

}
