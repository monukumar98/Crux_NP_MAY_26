package Lec10;

public class Sort_Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		DNF(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

	public static void DNF(int[] nums) {
		int zero = 0;
		int two = nums.length - 1;
		int i = 0;
		while (i <= two) {
			if (nums[i] == 0) {
				int temp = nums[zero];
				nums[zero] = nums[i];
				nums[i] = temp;
				zero++;
				i++;

			} else if (nums[i] == 2) {
				int temp = nums[two];
				nums[two] = nums[i];
				nums[i] = temp;
				two--;

			} else {
				i++;
			}
		}

	}

}
