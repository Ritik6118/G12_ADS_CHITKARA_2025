package Lecture_06;

import java.util.PriorityQueue;

public class Pq_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(3);
		pq.add(2);
		pq.add(1);
		pq.add(10);
		pq.add(5);
		pq.add(4);
		pq.add(7);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
