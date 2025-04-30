package Lecture_19;

import java.util.LinkedList;
import java.util.Queue;



public class Number_of_Enclaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numEnclaves(int[][] arr) {
		boolean[][] vis=new boolean [arr.length][arr[0].length];
		// traversal on boundaries column wise
		for(int r=0;r<arr.length;r++ ) {
			if(arr[r][0]==1) {
				bfs(r,0,arr,vis);
			}
			if(arr[r][arr[0].length-1]==1) {
				bfs(r,arr[0].length-1,arr,vis);
			}
		}
		for(int c=0;c<arr[0].length;c++) {
			if(arr[0][c]==1) {
				bfs(0,c,arr,vis);
			}
			if(arr[arr.length-1][c]==1) {
				bfs(arr.length-1,c,arr,vis);
			}
		}
		
		// iterate again on left grid to find number of enclaves
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==1 && vis[i][j]==false) {
					c++;
				}
			}
		}
		return c;
	}
	
	int[] row = { 1, 0, -1, 0 };
	int[] col = { 0, 1, 0, -1 };
	
	private void bfs(int i, int j, int[][] arr, boolean[][] vis) {
		// TODO Auto-generated method stub
		Queue<Pair> q=new LinkedList<>();
		q.add(new Pair(i,j));
		vis[i][j]=true;
		while(!q.isEmpty()) {
			Pair p=q.poll();
			for(int k=0;k<4;k++) {
				int nr=p.r+row[k];
				int nc=p.c+col[k];
				if(nr>=0 && nc >=0 && nr<arr.length && nc<arr[0].length && vis[nr][nc]==false && arr[nr][nc]==1) {
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
