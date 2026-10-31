package Lec37;

import java.util.*;

public class HashMap_Demo {

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
//		map.put(null, 77);
		System.out.println(map);
//		// containsKey
//		System.out.println(map.containsKey("Rajesh"));
//		System.out.println(map.containsKey("Raj"));
//		// get
//		System.out.println(map.get("Rajesh"));
//		System.out.println(map.get("Raj"));
//		// remove
//		System.out.println(map.remove("Rajesh"));
//		System.out.println(map.remove("Raj"));
//		System.out.println(map);

		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Kunal", 78);
		map1.put("Raj", 88);
		map1.put("Shiva", 65);
		map1.put("Puneet", 65);
		map1.put("yash", 17);
		map1.put("Shiva", 77);

		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Kunal", 78);
		map2.put("Raj", 88);
		map2.put("Shiva", 65);
		map2.put("Puneet", 65);
		map2.put("yash", 17);
		map2.put("Shiva", 77);
//		map.put(null, 77);
		System.out.println(map2);

	}

}
