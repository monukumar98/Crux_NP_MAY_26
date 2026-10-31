package Lec37;

import java.util.*;

public class HashMap_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Kunal", 78);
		map.put("Raj", 88);
		map.put("Shiva", 65);
		map.put("Puneet", 65);
		map.put("yash", 17);
		map.put("Shiva", 77);
		for(String k :map.keySet()) {
			System.out.println(k+" "+map.get(k));
		}
//		Set<String> key = map.keySet();
//		System.out.println(key);
//		for(String k :key) {
//			System.out.println(k+" "+map.get(k));
//		}
	}

}
