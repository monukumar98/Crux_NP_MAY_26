package Lec30;

import java.util.LinkedList;
import java.util.Queue;

public class LinekdList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		System.out.println(ll.remove());
		System.out.println(ll);
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(15);
		System.out.println(q.peek());// getfirst()
		System.out.println(q.poll());// q.remove()
		System.out.println(q);

	}

}
