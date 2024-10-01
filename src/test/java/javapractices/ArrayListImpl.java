package javapractices;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImpl {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(null);
		arrayList.add(20);

		for (Integer i : arrayList) {
			System.out.println(i);
		}

		System.out.println("###########################################");
		// Removes all of the elements from this list. The list will be empty after this
		// call returns
		arrayList.clear();

		for (Integer i : arrayList) {
			System.out.println(i);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		// Returns true if this list contains no elements.
		System.out.println("Array List is empty = " + arrayList.isEmpty());

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(10);
		arrayList2.add(20);
		arrayList2.add(30);
		arrayList2.add(200);
		arrayList2.add(10);
		arrayList2.add(2000);

		// Appends all of the elements in the specified collection to the end of this
		// list
		arrayList.addAll(arrayList2);

		for (Integer j : arrayList) {
			System.out.println(j);
		}
		System.out.println("####################################################");
		// Removes the element at the specified position in this list
		arrayList.remove(3);

		for (Integer j : arrayList) {
			System.out.println(j);
		}

		System.out.println("#####################################################");
		// Returns the number of elements in this list
		System.out.println(arrayList.size());

		System.out.println("#####################################################");

		// Returns true if this list contains the specified element.
		System.out.println(arrayList.contains(2000));
		System.out.println(arrayList.contains(1000));

		System.out.println("#######################################################");
		// Returns true if this list contains no elements.
		System.out.println(arrayList.isEmpty());

		System.out.println("#######################################################");
		// Returns the element at the specified position in this list.
		System.out.println(arrayList.get(0));

		System.out.println("########################################################");
		Iterator<Integer> it = arrayList.iterator();

		// Returns true if the iteration has more elements
		while (it.hasNext()) {
			// Returns true if the iteration has more elements
			System.out.println(it.next());
		}

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
		arrayList3.add(2000);
		arrayList3.add(30);
		arrayList3.add(500);

		// Removes from this list all of its elements that are contained in thespecified
		// collection.

		arrayList.removeAll(arrayList3);

		Iterator<Integer> it2 = arrayList.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}