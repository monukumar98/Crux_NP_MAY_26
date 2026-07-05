package Lec13;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1 = 10;
		int a = 5;
		System.out.println(a1);// address
		System.out.println(a);
		Long l = 90l;
		long l1 = 90;
		a1 = a;// Auto-Boxing
		a = a1;// Un-Boxing
		Integer c1 = 90;
		Integer c2 = 90;
		Integer c3 = 190;
		Integer c4 = 190;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
		Character ch1 = 'a';
		Character ch2 = 'a';
		System.out.println(ch1 == ch2);
		Boolean b1 = false;
		Boolean b2 = false;

		System.out.println(b1 == b2);

	}

}
