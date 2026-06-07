package Lec6;

public class Arrays_Swap1 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 4, 5 };
		// int[] arr1 = new int []{ 2, 3, 1, 4, 5 };
		System.out.println(arr[0] + " " + arr[1]);// 2 3
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
