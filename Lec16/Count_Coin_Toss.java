package Lec16;

public class Count_Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println("\n" + CoinToss(n, ""));
//		System.out.println("\n"+val);
	}

//	static int val = 0;

	public static int CoinToss(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return 1;
		}

		int x = CoinToss(n - 1, ans + "H");
		int y = CoinToss(n - 1, ans + "T");
		return x + y;

	}
//	public static void CoinToss(int n, String ans) {
//		if (n == 0) {
//			System.out.print(ans+" ");
//			val++;
//			return;
//		}
//		
//		CoinToss(n - 1, ans + "H");
//		CoinToss(n - 1, ans + "T");
//		
//	}

}
