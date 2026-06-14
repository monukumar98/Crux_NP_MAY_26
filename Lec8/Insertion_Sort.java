package Lec8;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 9, 1, 7, 4, 2, 11 };
		// InsertLastElement(arr, arr.length - 1);
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			InsertLastElement(arr, i);
		}
	}

	public static void InsertLastElement(int[] arr, int i) {
		// TODO Auto-generated method stub
		int item = arr[i];
		int j = i - 1;
		while (j >= 0 && arr[j] > item) {
			arr[j + 1] = arr[j];
			arr[j] = item;
			j--;
		}
		// retrun j+1 // last element ka correct index hai
	}

}
