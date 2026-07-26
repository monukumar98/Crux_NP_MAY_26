package Lec17;

import java.util.*;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> list = new ArrayList<>();
		Parentheses(n, 0, 0, "", list);
		System.out.println(list);
	}

	public static void Parentheses(int n, int open, int closed, String ans, List<String> list) {
		if (open == n && closed == n) {
			// System.out.println(ans);
			list.add(ans);
			return;
		}
		if (open > n || closed > open) {
			return;
		}
		Parentheses(n, open, closed + 1, ans + ")", list);
		Parentheses(n, open + 1, closed, ans + "(", list);
		

	}

}
