package Lecture_06;

import java.text.Collator;
import java.util.*;
import java.util.PriorityQueue;

public class merge_k_sorted_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
			@Override
			public int compare(ListNode l1,ListNode l2) {
				return l1.val-l2.val;
			}
		});
		for(ListNode n: lists) {
			while(n!=null) {
				pq.add(n);
				n=n.next;
			}
		}
		ListNode temp=new ListNode();
		ListNode ans=temp;
		while(!pq.isEmpty()) {
			temp.next=pq.poll();
			temp=temp.next;
		}
		return ans.next;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
