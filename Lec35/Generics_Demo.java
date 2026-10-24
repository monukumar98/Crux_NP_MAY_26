package Lec35;

public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 20, 30, 40, 50 };
		display(arr);
		String[] arr1 = { "Ankit", "Raj", "Anas", "DJ", "champa" };
		display(arr1);
	}

	public static <T> void display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static <T> T get(T[] arr) {
		return arr[0];
	}

}
