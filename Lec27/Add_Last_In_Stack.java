package Lec27;

import java.util.Stack;

public class Add_Last_In_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		addlast(st, -7);
		System.out.println(st);

	}

	public static void addlast(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int x = st.pop();
		addlast(st, item);
		st.push(x);

	}

}
