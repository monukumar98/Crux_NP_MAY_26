package Lec39;

import java.util.*;

public class Graph {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}

	public int number_of_Edge() {
		int sum = 0;
		for (int v : map.keySet()) {
			sum = sum + map.get(v).size();
		}
		return sum / 2;
	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void removevertex(int v1) {
		for (int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}

	public void Display() {
		for (int v : map.keySet()) {
			System.out.println(v + " " + map.get(v));
		}
	}

	public boolean hashpath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = hashpath(nbrs, des, visited);
				if (ans) {
					return true;
				}
			}
		}
		visited.remove(src);
		return false;

	}

	public void PrintAllpath(int src, int des, HashSet<Integer> visited,String ans) {
		if (src == des) {
			System.out.println(ans+des);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				PrintAllpath(nbrs, des, visited,ans+src);

			}
		}
		visited.remove(src);
	}

}
