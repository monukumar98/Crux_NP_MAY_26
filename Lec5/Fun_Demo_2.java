package Lec5;

public class Fun_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a = 7;
		int b = 9;
//		int ans=addition(a, b);
//		System.out.println(ans);
		System.out.println(addition(a, b));
		System.out.println("Okay");

	}

	public static int addition(int a, int b) {

		int c = a + b;
		return c + sub(c, a);
	}

	public static int sub(int a, int b) {
		return a - b;
	}

}

