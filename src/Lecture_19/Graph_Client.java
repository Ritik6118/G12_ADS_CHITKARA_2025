package Lecture_19;

import java.util.HashSet;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g=new Graph();
		for(int i=1;i<=8;i++) {
			g.addVertex(i);
		}
		g.addEdge(1, 2, 0);
		g.addEdge(1, 4, 0);
		g.addEdge(1, 4, 0);
		g.addEdge(2, 7, 0);
		g.addEdge(2, 5, 0);
		g.addEdge(2, 4, 0);
		g.addEdge(3, 4, 0);
		g.addEdge(4, 5, 0);
		g.addEdge(7, 8, 0);
		g.addEdge(8, 6, 0);
		g.addEdge(5, 6, 0);
		g.addEdge(4, 6, 0);
		g.shortestPath_unweighted(1, 6);
	}
	
}

