package Lec13;

public class StringBuilder_vs_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	StringTC();
		StringBuilderTC();
	}

	public static void StringBuilderTC() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000_000; i++) {
			sb.append(i);
		}

	}

	public static void StringTC() {
		// TODO Auto-generated method stub
		String s = "";
		for (int i = 0; i < 1000_000; i++) {
			s = s + i;
		}
	}

}
