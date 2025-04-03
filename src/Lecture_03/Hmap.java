package Lecture_03;

public class Hmap<K, V> {
	class Node<K, V> {
		K key;
		V val;
		Node next;

		Node() {

		}

		Node(K key, V val) {
			this.key = key;
			this.val = val;
		}

	}

	Node[] arr;
	int size;

	Hmap(int x) {
		arr = new Node[x];
	}

	Hmap() {
		this(4);
	}

	public void put(K key, V val) {
		int bn = hashfun(key); // index of node on array

		Node temp = arr[bn];
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.val = val;
				return;
			}
			temp = temp.next;
		}

//		System.out.println("hi");
		Node nn = new Node(key, val);
		nn.next = arr[bn];
		arr[bn]=nn;
		size++;

		// if lf > thf resize

		double thf = 2.0;
		double lf = (1.0 * size) / arr.length;
		if (lf > thf) {
			rehashing();
		}
	}

	private void rehashing() {
		// TODO Auto-generated method stub
		Node [] oa=this.arr;
		Node [] na=new Node[oa.length*2];
		this.arr=na;
		size=0;
		for(Node n:oa) {
			while(n!=null) {
				this.put((K)(n.key), (V)(n.val));
				n=n.next;
			}
		}
		
		
	}

	private int hashfun(K key) {
		// TODO Auto-generated method stub
		int bn = key.hashCode() % arr.length; // bade integer ko array pe map krne ke liye

		if (bn < 0) { // negative me arr.length -1 tk jayega kyoki modulo ho chulka hai
			bn += arr.length;
		}
		return bn;
	}

	public void remove(K key) {
		int bn = hashfun(key);
		Node prev = null;
		Node curr = arr[bn];

		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			// you can throw exception that the element dosen't exist
			return;
		} else if (prev == null) {
			// muje head remove krna hai
			arr[bn] = curr.next;
			curr.next = null;
		} else {
			prev.next = curr.next;
			curr.next = null;
		}
		size--;

	}

	public V get(K key) {
		int bn = hashfun(key); // index of node on array

		Node temp = arr[bn];
		while (temp != null) {
			if (temp.key.equals(key)) {
				return(V)(temp.val);
			}
			temp = temp.next;
		}
		return null;
	}
	public boolean containsKey(K key) {
		int bn = hashfun(key); // index of node on array

		Node temp = arr[bn];
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s="{ ";
		for(Node n:arr) {
			while(n!=null) {
				s+="( "+n.key+" <=> "+n.val+" )\n";
				n=n.next;
			}
		}
		s+=" }";
		return s;
	}
}
