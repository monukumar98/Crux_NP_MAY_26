package Lec17;

public class Letter_Combinations_of_a_Phone_Number {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		String ques = "239";
		Letter_Combinations(ques, "");
	}

	public static void Letter_Combinations(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);// '2'
		String keypaid = key[ch - '0'];
		for (int i = 0; i < keypaid.length(); i++) {
			Letter_Combinations(ques.substring(1), ans + keypaid.charAt(i));
		}

	}

}
