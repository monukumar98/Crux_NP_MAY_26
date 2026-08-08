package Lec20;

public class Coin_Combinaton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2,3,6,7 };
		int amount = 7;
		Combinaton(coin, amount, "",0);

	}

	public static void Combinaton(int[] coin, int amount, String ans,int idx) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = idx; i < coin.length; i++) {
			if(amount>=coin[i]) {
				Combinaton(coin,amount-coin[i], ans+coin[i],i);
			}
		}

	}
}
