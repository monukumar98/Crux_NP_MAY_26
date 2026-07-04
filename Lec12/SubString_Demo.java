package Lec12;

public class SubString_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding";
//		System.out.println(s.substring(1, 4));
//		System.out.println(s.substring(1));
		print(s);
		String s1 = "HsjwgygakTFTHFGHA";
		s1 = s1.toLowerCase();
		System.out.println(s1);
	}

	public static void print(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

}
