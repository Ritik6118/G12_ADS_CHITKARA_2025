package Lecture_07;

import java.util.*;

public class Non__Overlaping_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int eraseOverlapIntervals(int[][] intervals) {
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] a1, int[] a2) {
				// TODO Auto-generated method stub
				return a1[1] - a2[1];
			}
		});
		for (int[] a : intervals) {
			pq.add(a);
		}
		int[] a = pq.poll();
		int c = 1;
		int ct = a[1];
		while (!pq.isEmpty()) {
			int[] intr = pq.poll();
			int st = intr[0];
			int et = intr[1];
			if (ct <= st) {
				c++;
				ct = et;
			}
		}
		return intervals.length - c;
	}

}
