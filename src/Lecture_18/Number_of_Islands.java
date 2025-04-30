package Lecture_18;

import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Islands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int numIslands(char[][] arr) {
		boolean[][] vis = new boolean[arr.length][arr[0].length];
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == '1' && vis[i][j] == false) {
					c++;
					bfs(i, j, vis, arr);
				}
			}
		}
		return c;
	}

	int[] row = { 1, 0, -1, 0 };
	int[] col = { 0, 1, 0, -1 };

	private void bfs(int i, int j, boolean[][] vis, char[][] arr) {
		// TODO Auto-generated method stub
		Queue<Pair> q=new LinkedList<>();
		q.add(new Pair(i,j));
		vis[i][j]=true;
		while(!q.isEmpty()) {
			Pair p=q.poll();
			for(int k=0;k<4;k++) {
				int nr=p.r+row[k];
				int nc=p.c+col[k];
				if(nr>=0 && nc >=0 && nr<arr.length && nc<arr[0].length && vis[nr][nc]==false && arr[nr][nc]=='1') {
					q.add(new Pair(nr,nc));
					vis[nr][nc]=true;
				}
			}
		}
	}

}

class Pair {
	int r;
	int c;

	Pair(int row, int col) {
		r = row;
		c = col;
	}
}
