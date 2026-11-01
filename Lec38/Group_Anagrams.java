package Lec38;

import java.util.*;
import java.util.HashMap;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };

	}

	public static List<List<String>> Anagram(String[] arr) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			String key = getKey(arr[i]);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(arr[i]);
		}

		List<List<String>> ll = new ArrayList<>();
		for (String k : map.keySet()) {
			ll.add(map.get(k));
		}
		return ll;
	}

	private static String getKey(String s) {
		// TODO Auto-generated method stub
		int [] freq = new int [26];
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			freq[ch-'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i]+" ");
		}
		return sb.toString();
		
	}
}












