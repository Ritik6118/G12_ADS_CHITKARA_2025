package Lecture_14;

public class KnapSac01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3};
		int [] b= {4,5,1};
		int w=4;
		System.out.println(knapsack(w,a,b));
	}

	static int knapsack(int W, int val[], int wt[]) {
		// code here
		Integer[][] dp = new Integer[val.length][W + 1];
		return solve(dp, W, val, wt, 0);
	}

	private static int solve(Integer[][] dp, int cap, int[] val, int[] wt, int i) {
		// TODO Auto-generated method stub
		if(i==wt.length) {
			return 0;
		}
		if(dp[i][cap]!=null) {
			return dp[i][cap];
		}
		int pick=0;
		if(cap>=wt[i]) {
			pick=val[i]+solve(dp,cap-wt[i],val,wt,i+1);
		}
		int notpick=solve(dp,cap,val,wt,i+1);
		
		return dp[i][cap]=Math.max(pick, notpick);
		
	}

}
