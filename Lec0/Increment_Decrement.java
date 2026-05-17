package Lec0;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
//		System.out.println(--x);// 7
//		System.out.println(x);// 7
//		System.out.println(x++);// 8
//		System.out.println(x);// 9

//		int a = x++ - --x + x++ - --x + --x;// 7
		int a = ++x + --x + x++ - --x + ++x + 2;
		System.out.println(a);
		

	}

}
