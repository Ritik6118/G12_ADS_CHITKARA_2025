package Lecture_18;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Number_of_provinces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
