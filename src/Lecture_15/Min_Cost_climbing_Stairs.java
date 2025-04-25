package Lecture_15;

public class Min_Cost_climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minCostClimbingStairs(int[] cost) {
		dp = new Integer[cost.length];
		int a = solve(0, cost);
		dp = new Integer[cost.length];
		int b = solve(1, cost);
		return Math.min(a, b);

	}

	Integer[] dp;

	private int solve(int i, int[] cost) {
		// TODO Auto-generated method stub
		if (i >= cost.length) {
			return 0;
		}
		if (dp[i] != null) {
			return dp[i];
		}
		int a = cost[i] + solve(i + 1, cost);
		int b = cost[i] + solve(i + 2, cost);
		return dp[i] = Math.min(a, b);
	}

}
