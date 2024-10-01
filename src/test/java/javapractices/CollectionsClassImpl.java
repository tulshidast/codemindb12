package javapractices;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassImpl {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(20);
		arrayList.add(5);
		arrayList.add(7);

		Collections.sort(arrayList);

		for (Integer i : arrayList) {
			System.out.println(i);
		}

		System.out.println("#########################################");

		Collections.reverse(arrayList);

		for (Integer i : arrayList) {
			System.out.println(i);
		}

		System.out.println(arrayList.get(1));

		System.out.println("##########################################");

		System.out.println(Collections.min(arrayList));
		System.out.println(Collections.max(arrayList));

	}

}
