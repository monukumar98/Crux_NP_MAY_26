package Lec13;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int Count_Cb_Number(String str) {
		int c = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				String s = str.substring(i, j);
				if (Is_CB_Numbers(Long.parseLong(s)) && isvisited(visited, i, j - 1) == false) {
					c++;
					for (int k = i; k < j; k++) {
						visited[k]=true;
					}
				}

			}
		}
		return c;
	}

	public static boolean isvisited(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for (int k = i; k <= j; k++) {
			if (visited[k]) {
				return true;
			}
		}
		return false;
	}

	public static boolean Is_CB_Numbers(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
