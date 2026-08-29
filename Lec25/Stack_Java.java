package Lec25;

import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();// 10
		// add
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		// remove
		System.out.println(st.pop());
		// view
		System.out.println(st.peek());
		System.out.println(st);
		// size
		System.out.println(st.size());
		for (int x : st) {
			System.out.print(x + " ");
		}
		System.out.println();
	}


}






