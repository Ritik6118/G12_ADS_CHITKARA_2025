package Lecture_09;

public class Heap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap<Integer> pq=new Heap<>();
		pq.add(1);
		pq.add(10);
		pq.add(2);
		pq.add(20);
		pq.add(3);
		pq.add(30);
		for(int i=0;i<6;i++) {
			System.out.println(pq.poll());
		}
		
	}

}
