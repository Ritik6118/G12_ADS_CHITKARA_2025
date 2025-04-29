package Lecture_18;
import java.util.*;
public class Graph {
	HashMap<Integer,HashMap<Integer,Integer>> map;
	Graph(){
		map=new HashMap<>();
	}
	
	public void addVertex(int v1) {
		map.put(v1,new HashMap<>());
	}
	public void removeVertex(int v1) {
		for(int i:map.get(v1).keySet()) {
			int nbr=i;
			map.get(nbr).remove(v1);
		}
		map.remove(v1);
	}
	public void addEdge(int v1,int v2, int wt) {
		map.get(v1).put(v2, wt);
		map.get(v2).put(v1, wt);
	}
	public void removeEdge(int v1,int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
	public void diplay() {
		for(int i:map.keySet()) {
			System.out.println(i +"-->"+ map.get(i));
		}
	}
	public boolean HasPath(int src,int des) {
		HashSet<Integer> vis=new HashSet<>();
		return haspath(src,des,vis);
	}
	private boolean haspath(int src, int des, HashSet<Integer> vis) {
		// TODO Auto-generated method stub
		vis.add(src);
		if(src==des) {
			return true;
		}
		
		for(int i:map.get(src).keySet()) {
			if(vis.contains(i)==false) {
				if(haspath(i,des,vis)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean bfs(int src,int des) {
		Queue<Integer> q=new LinkedList<>();
		HashSet<Integer> vis=new HashSet<>();
		q.add(src);
		while(!q.isEmpty()) {
			int n=q.poll();
			if(n==des) {
				return true;
			}
			if(vis.contains(n)) {
				continue;
			}
			vis.add(n);
			for(int i:map.get(n).keySet()) {
				q.add(i);
			}
		}
		return false;
	}
	public boolean dfs(int src,int des) {
		Stack<Integer> st=new Stack<>();
		HashSet<Integer> vis=new HashSet<>();
		st.add(src);
		while(!st.isEmpty()) {
			int n=st.pop();
			if(n==des) {
				return true;
			}
			if(vis.contains(n)) {
				continue;
			}
			vis.add(n);
			for(int i:map.get(n).keySet()) {
				st.push(i);
			}
		}
		return false;
	}
	
	public void bft() {
		HashSet<Integer> vis=new HashSet<>();
		Queue<Integer> q=new LinkedList<>();
		for(int i=1;i<=map.size();i++) {
			if(!vis.contains(i)) {
				q.add(i);
				while(!q.isEmpty()) {
					int n=q.poll();
					if(vis.contains(n)) {
						continue;
					}
					System.out.println(n);
					vis.add(n);
					for(int j:map.get(n).keySet()) {
						q.add(j);
					}
				}
			}
		}
	}
	public int component() {
		int c=0;
		HashSet<Integer> vis=new HashSet<>();
		Queue<Integer> q=new LinkedList<>();
		for(int i=1;i<=map.size();i++) {
			if(!vis.contains(i)) {
				q.add(i);
				c++;
				while(!q.isEmpty()) {
					int n=q.poll();
					if(vis.contains(n)) {
						continue;
					}
					vis.add(n);
					for(int j:map.get(n).keySet()) {
						q.add(j);
					}
				}
			}
		}
		return c;
	}
}
