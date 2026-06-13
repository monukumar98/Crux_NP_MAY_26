package Lec7;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
	}

	public static int Start_index(int[] gas, int[] cost) {
		int total_sum = 0;
		for (int i = 0; i < cost.length; i++) {
			total_sum += gas[i] - cost[i];
		}
		if (total_sum < 0) {
			return -1;
		}
		int idx = 0;
		int sum = 0;
		for (int i = 0; i < cost.length; i++) {
			sum += gas[i] - cost[i];
			if (sum < 0) {
				idx = i + 1;
			}
		}
		return idx;

	}

}
