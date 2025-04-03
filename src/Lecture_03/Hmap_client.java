package Lecture_03;

public class Hmap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hmap<Character,Integer> map=new Hmap<>();
		map.put('a', 1);
//		System.out.println(map);
		map.put('a', 2);
		map.put('b', 2);
		map.put('c', 2);
		map.put('d', 2);
		map.put('e', 2);
		map.remove('a');
//		System.out.println(map.get('a'));
		System.out.println(map);
	}

}
