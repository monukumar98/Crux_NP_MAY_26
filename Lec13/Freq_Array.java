package Lec13;

public class Freq_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ututsgjghgaxfxafsygdcjgvgadhsfgdsahffadscfndsafgfhgdasfhncdsbvmcxhjasdfhg";
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch - 'a']++;// freq[ch-'a']= freq[ch-'a'] +1;
		}

		for (int i = 0; i < freq.length; i++) {
			System.out.print(freq[i] + " ");
		}
	}

}
