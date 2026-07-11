package Lec14;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		// add
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(1, -9);// O(N)
		System.out.println(ll);
		// get
		System.out.println(ll.get(0));// O(1)
		System.out.println(ll.get(3));
		// remove
		System.out.println(ll.remove(1));// O(N)
		System.out.println(ll);
		// update
		ll.set(2, -11);// O(1)
		System.out.println(ll);
		Collections.sort(ll);// O(Nlog(N))
		Collections.reverse(ll);// O(N)
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
		}

	}

}
