package Lec6;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = new int[5];
	//	int arr[] = new int[5];
		System.out.println(arr);
		System.out.println(arr[2]);
		int[] other = arr;
		System.out.println(arr.length);
		System.out.println(other.length);
		arr[0] = 15;
		arr[1] = 2;
		arr[2] = 8;
		arr[3] = 6;
		arr[4] = 2;
		System.out.println(other[0]);
		System.out.println(other[1]);
		System.out.println(other[2]);
		System.out.println(other[3]);
		System.out.println(other[4]);

	}

}
