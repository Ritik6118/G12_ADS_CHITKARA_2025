package Lecture_12;

public class house_robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int rob(int[] nums) {
        dp=new Integer[nums.length];
        return solve(0,nums);   
    }
    Integer[] dp;
    public int solve(int idx,int [] arr){
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }
        int pick=arr[idx]+solve(idx+2,arr);
        int notpick=solve(idx+1,arr);
        return dp[idx]=Math.max(pick,notpick);
    }

}
