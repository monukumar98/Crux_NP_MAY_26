package Lec39;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 2, 6 };
		int k = 100;
		System.out.println(Product_Less_Than_K(arr, k));

	}

	public static int Product_Less_Than_K(int[] arr, int k) {
		int p = 1;
		int ei = 0, si = 0, ans = 0;
		while (ei < arr.length) {
			// window grow
			p = p * arr[ei];
			// window shrink
			while (p >= k && si <= ei) {
				p = p / arr[si];
				si++;
			}
			// ans update
			ans = ans + (ei - si + 1);
			ei++;
		}
		return ans;
	}

}
