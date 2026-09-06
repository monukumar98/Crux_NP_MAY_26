package Lec26;

public class Sum_Of_N_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 5));
		System.out.println(add(2, 5, 9));
		System.out.println(add(2, 5, 9.6));
		System.out.println(add(2, 5, 9, 2, 2, 1, 3, 1, 3, 1, 3, 3, 1, 3));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, double c) {
		return (int) (a + b + c);
	}

	public static int add(int a, int... x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum;

	}

}
