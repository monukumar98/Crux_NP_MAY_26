package Lec23;

public class Power_Log_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int n = 9;
		System.out.println(pow(a, n));

	}

	public static int pow(int a, int n) {
		if (n == 0) {
			return 1;
		}
		int x = pow(a, n / 2);
		x = x * x;
		if (n % 2 != 0) {
			x = x * a;
		}
		return x;
	}

}
