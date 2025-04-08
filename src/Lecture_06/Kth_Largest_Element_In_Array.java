package Lecture_06;

import java.util.PriorityQueue;

public class Kth_Largest_Element_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,2,3,1,2,4,5,5,6};
		int k=4;
		System.out.println(solve(arr,k));
	}
	public static int solve(int [] arr,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		//add first k elements
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
//		System.out.println(pq);
		for(int i=k;i<arr.length;i++) {
//			System.out.println(arr[i]);
			if(arr[i]>=pq.peek()) {
				pq.add(arr[i]);
				pq.poll();
			}
//			System.out.println(pq);
		}
		return pq.poll();
	}

}
