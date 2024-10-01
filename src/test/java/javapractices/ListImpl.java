package javapractices;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ListImpl {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(200);
		list.add(100);
		list.add(20);
		list.add(null);
		
        
//		for (Integer i : list) {
//			System.out.println(i);
//		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}