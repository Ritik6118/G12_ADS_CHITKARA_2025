package Lecture_02;

import java.util.HashMap;

public class Longest_Substring_With_Atmost_K_Distinct_Chars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabcdaaaaa";
		String s2= "aaabaaaa";
		int k = 2;
		System.out.println(solve(s2, k));

	}

	private static int solve(String s, int k) {
		// TODO Auto-generated method stub
		int si = 0;// starting index of window
		int ei = 0;// Ending Index of Window

		HashMap<Character, Integer> map = new HashMap<>();

		int max = 0;

		while (ei < s.length()) {
			char ch_ei = s.charAt(ei);
			if (map.containsKey(ch_ei)) {
				int currfreq = map.get(ch_ei);
				map.put(ch_ei, currfreq + 1);
			} else {
				map.put(ch_ei, 1);
			}

			while (map.size() > k && si < ei) {
				char ch_si = s.charAt(si);
				int currfreq = map.get(ch_si);
				map.put(ch_si, currfreq - 1);
				if (map.get(ch_si) == 0) {
					map.remove(ch_si);
				}
				si++;
			}

			max = Math.max(max, ei - si + 1);
			ei++;
		}

		return max;
	}

}
