package Lecture_21;

import java.util.*;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g=new Graph();
		for(int i=1;i<=7;i++) {
			g.addVertex(i);
		}
		g.addEdge(1, 3, 1);
		g.addEdge(1, 2, 4);
		g.addEdge(2, 3, 2);
		g.addEdge(2, 4, 2);
		g.addEdge(4, 5, 2);
		g.addEdge(4, 7, 8);
		g.addEdge(7, 6, 3);
		g.addEdge(6, 5, 1);
//		g.removeEdge(2, 4);
//		g.diplay();
//		System.out.println(g.bfs(1,4));
//		System.out.println(g.HasPath(1, 4));
//		g.bft();
		g.shortestPath(1, 7);
//		System.out.println(g.component());
	}

	
}
