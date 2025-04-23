package Lecture_13;

public class Longest_Incrasing_Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
		dp = new Integer[arr.length][arr.length + 1];
		System.out.println(lis(arr, -1, 0));

	}

	static Integer[][] dp;

	private static int lis(int[] arr, int prev, int idx) {
		// TODO Auto-generated method stub
		if (idx >= arr.length) {
			return 0;
		}
		if (dp[idx][prev + 1] != null) {
			return dp[idx][prev + 1];
		}
		int p = 0;
		if (prev == -1 || arr[prev] < arr[idx]) {
			p = 1 + lis(arr, idx, idx + 1);
		}
		int np = 0 + lis(arr, prev, idx + 1);

		return dp[idx][prev + 1] = Math.max(p, np);
	}

}
