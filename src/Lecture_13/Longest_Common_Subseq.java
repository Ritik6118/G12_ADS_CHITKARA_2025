package Lecture_13;

public class Longest_Common_Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "ace";
		System.out.println(lcs(s1, s2, 0, 0));
	}

	private static int lcs(String s1, String s2, int i, int j) {
		// TODO Auto-generated method stub
		if (i >= s1.length() || j >= s2.length()) {
			return 0;
		}

		int match = 0;
		int notmatch = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			match = 1 + lcs(s1, s2, i + 1, j + 1);
		} else {
			int call_for_stationary_i = lcs(s1, s2, i, j + 1);
			int call_for_stationary_j = lcs(s1, s2, i + 1, j);
			int max = Math.max(call_for_stationary_i, call_for_stationary_j);
			notmatch = 0 + max;
		}

		return Math.max(match, notmatch);
	}

}
