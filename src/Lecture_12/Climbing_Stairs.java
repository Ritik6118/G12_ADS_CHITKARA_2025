package Lecture_12;

public class Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Integer[] dp=new Integer[46];
	public int climbStairs(int n) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		if(dp[n]!=null) {
			return dp[n];
		}
		
		int a=climbStairs(n-1);
		int b=climbStairs(n-2);
		return dp[n]=a+b;
	}

}
