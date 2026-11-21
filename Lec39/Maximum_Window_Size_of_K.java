package Lec39;

public class Maximum_Window_Size_of_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 2, 4, 5, 8, 9 };
		int k = 3;
		System.out.println(Window_Size_of_K(arr, k));

	}

	public static int Window_Size_of_K(int[] arr, int k) {
		int sum = 0;
		int ans = 0;
		// 1st window ka answer
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			// 1. window ko grow
			sum += arr[i];
			// 2. window ko shrink
			sum -= arr[i - k];
			// 3. ans update
			ans = Math.max(ans, sum);
		}
		return ans;

	}

}
