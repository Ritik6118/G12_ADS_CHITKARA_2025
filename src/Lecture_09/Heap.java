package Lecture_09;
import java.util.*;
public class Heap<T extends Comparable> {
	ArrayList<T> li=new ArrayList<>();
	
	Heap(){
		li=new ArrayList<>();
	}
	
	private void swap(int i,int j) {
		T temp=li.get(i);
		li.set(i, li.get(j));
		li.set(j, temp);
	}
	private int parent(int idx) {
		// TODO Auto-generated method stub
		return (idx-1)/2;
	}
	private int leftchild(int idx) {
		// TODO Auto-generated method stub
		return (2*idx)+1;
	}
	private int rightchild(int idx) {
		// TODO Auto-generated method stub
		return (2*idx)+2;
	}
	
	public void add(T val) {
		li.add(val);
		upheapify(li.size()-1);
	}
	private void upheapify(int idx) {
		// TODO Auto-generated method stub
		if(idx==0) {
			return;
		}
		int p=parent(idx);
		if(li.get(idx).compareTo(li.get(p))<0) {
			swap(idx,p);
			upheapify(p);
		}
	}


	public T poll() {
		if(li.size()==0) {
			System.out.println("heap is empty");
			return null;
		}
		T temp=li.get(0);
		li.set(0, li.get(li.size()-1));
		li.remove(li.size()-1);
		if(li.size()>0) {
			downheapify(0);
		}
		return temp;
		
	}
	private void downheapify(int idx) {
		// TODO Auto-generated method stub
		int min=idx;
		int lc=leftchild(idx);
		int rc=rightchild(idx);
		
		if(lc<li.size() && li.get(min).compareTo(li.get(lc))>0) {
			min=lc;
		}
		if(rc<li.size() && li.get(min).compareTo(li.get(rc))>0) {
			min=rc;
		}
		if(min!=idx) {
			swap(idx,min);
			downheapify(min);
		}
//		System.out.println(idx+" "+min);
		
	}

	public T peek() {
		return li.get(0);
	}
	
}
