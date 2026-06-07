package Lec5;

public class Fun_Demo_3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a = 7;
		int b = 9;
		System.out.println(val);// 100
		System.out.println(addition(a, b));// 25
		System.out.println(val);
		System.out.println("Okay");

	}

	public static int addition(int a, int b) {
		int val = 80;
		Fun_Demo_3.val = Fun_Demo_3.val - 5;
		int c = a + b;
		return c + sub(c, a);
	}

	public static int sub(int a, int b) {
		return a - b;
	}

}
