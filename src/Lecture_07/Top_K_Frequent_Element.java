package Lecture_07;
import java.util.*;
public class Top_K_Frequent_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] topKFrequent(int[] arr, int k) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i: arr) {
			if(map.containsKey(i)) {
				int cf=map.get(i);
				map.put(i, cf+1);
			}
			else {
				map.put(i, 1);
			}
		}
		PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>() {

			@Override
			public int compare(Pair p1, Pair p2) {
				// TODO Auto-generated method stub
				int a=p2.freq-p1.freq;
				return a;
			}
			
		});
		for(int i:map.keySet()) {
			pq.add(new Pair(i,map.get(i)));
		}
		int [] ans=new int[k];
		int idx=0;
		while(k-->0) {
			ans[idx++]=pq.poll().val;
		}
		return ans;
		
	}

}
class Pair{
	int val;
	int freq;
	Pair(int v,int f){
		val=v;
		freq=f;
	}
}
