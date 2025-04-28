package Lecture_17;
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
}
