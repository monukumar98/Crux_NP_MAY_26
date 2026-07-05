package Lec13;

public class Freq_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HFAHFHfysyrywjb w hfrwyr2riwiuity2dvkjdhufw s.k;lks;jurwyetdgfcnbv mhgsrtSGCn";
		int[] freq = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch]++;// freq[ch-'a']= freq[ch-'a'] +1;
		}

		for (int i = 0; i < freq.length; i++) {
			System.out.print(freq[i] + " ");
		}
	}

}
