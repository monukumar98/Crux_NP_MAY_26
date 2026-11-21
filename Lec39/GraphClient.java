package Lec39;

import java.util.HashSet;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.AddEdge(1, 4, 5);
		g.AddEdge(1, 2, 3);
		g.AddEdge(3, 2, 4);
		g.AddEdge(4, 5, 1);
		g.AddEdge(4, 3, 2);
		g.AddEdge(5, 6, -9);
		g.AddEdge(7, 6, 6);
		g.AddEdge(5, 7, 3);
		System.out.println(g.hashpath(1, 6,new HashSet<>()));
		g.PrintAllpath(1, 6, new HashSet<>(), "");

	}

}
