package Lec40;

import java.util.*;


public class Graph_Bipartite {

	class Solution {
		public boolean isBipartite(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			int c = 0;
			for (int i = 0; i < graph.length; i++) {
				if (visited.containsKey(i)) {
					continue;
				}
				q.add(new BipartitePair(i, 0));
				while (!q.isEmpty()) {
					// 1. Remove
					BipartitePair rp=q.poll();
					// 2. Ignore if Already visited
					if(visited.containsKey(rp.vtx)) {
						if(visited.get(rp.vtx)!=rp.dis) {
							return false;
						}
						continue;
					}
					// 3. Marked Visited
					visited.put(rp.vtx, rp.dis);
					// 4. Self Work
					// 5. Add unvisted nbsr
					for(int nbrs:graph[rp.vtx]) {
						if(!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, rp.dis+1));
						}
					}
				}
			}
			return true;
		}
		
	}

	class BipartitePair {
		int dis;
		int vtx;

		public BipartitePair(int vtx, int dis) {
			// TODO Auto-generated constructor stub
			this.dis = dis;
			this.vtx = vtx;
		}
	}

}
