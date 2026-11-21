package Lec39;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abaaaabababaabaaa";
		int k = 2;
		int flipa = longestLength(s, k, 'a');
		int flipb = longestLength(s, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int longestLength(String s, int k, char ch) {
		int ei = 0, si = 0, flip = 0, ans = 0;
		while (ei < s.length()) {
			// grow
			char ch1 =s.charAt(ei);
			if(ch1==ch) {
				flip++;
			}
			// shrink
			while(flip>k && si<=ei) {
				if(ch1==ch) {
					flip--;
				}
				si++;
			}
			// answer update
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;

	}

}
