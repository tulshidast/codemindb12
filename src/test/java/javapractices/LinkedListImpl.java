package javapractices;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListImpl {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(null);
		linkedList.add(20);

		for (Integer i : linkedList) {
			System.out.println(i);
		}

		System.out.println("###########################################");
		// Removes all of the elements from this list. The list will be empty after this
		// call returns
		linkedList.clear();

		for (Integer i : linkedList) {
			System.out.println(i);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		// Returns true if this list contains no elements.
		System.out.println("Array List is empty = " + linkedList.isEmpty());

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.add(10);
		linkedList2.add(20);
		linkedList2.add(30);
		linkedList2.add(200);
		linkedList2.add(10);
		linkedList2.add(2000);

		// Appends all of the elements in the specified collection to the end of this
		// list
		linkedList.addAll(linkedList2);

		for (Integer j : linkedList) {
			System.out.println(j);
		}
		System.out.println("####################################################");
		// Removes the element at the specified position in this list
		linkedList.remove(3);

		for (Integer j : linkedList) {
			System.out.println(j);
		}

		System.out.println("#####################################################");
		// Returns the number of elements in this list
		System.out.println(linkedList.size());

		System.out.println("#####################################################");

		// Returns true if this list contains the specified element.
		System.out.println(linkedList.contains(2000));
		System.out.println(linkedList.contains(1000));

		System.out.println("#######################################################");
		// Returns true if this list contains no elements.
		System.out.println(linkedList.isEmpty());

		System.out.println("#######################################################");
		// Returns the element at the specified position in this list.
		System.out.println(linkedList.get(0));

		System.out.println("########################################################");
		Iterator<Integer> it = linkedList.iterator();

		// Returns true if the iteration has more elements
		while (it.hasNext()) {
			// Returns true if the iteration has more elements
			System.out.println(it.next());
		}

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		LinkedList<Integer> linkedList3 = new LinkedList<Integer>();
		linkedList3.add(2000);
		linkedList3.add(30);
		linkedList3.add(500);

		// Removes from this list all of its elements that are contained in thespecified
		// collection.

		linkedList.removeAll(linkedList3);

		Iterator<Integer> it2 = linkedList.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}
