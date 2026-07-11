package Lec14;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayList_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		// add
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(1, -9);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		ll.add(1);
		ll.add(15);
		System.out.println(ll.size());
		Vector<Integer> v = new Vector<>();
		System.out.println(v.capacity());
	}

}
