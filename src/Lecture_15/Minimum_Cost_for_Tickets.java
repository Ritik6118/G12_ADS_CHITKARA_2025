package Lecture_15;

public class Minimum_Cost_for_Tickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int mincostTickets(int[] days, int[] costs) {
        
        int [] freq=new int [366];;
        for(int i:days) {
        	freq[i]++;
        }
        dp=new Integer[366]; 
		return solve(freq,costs,1);
    }
	Integer [] dp;
	private int solve(int [] freq, int[] costs, int i) {
		// TODO Auto-generated method stub
		if(i==freq.length) {
			return 0;
		}
		
		if(dp[i]!=null) {
			return dp[i];
		}
		if(freq[i]==0) {
			return solve(freq,costs,i+1);
		}
		int a=costs[0]+solve(freq,costs,i+1);
		int b=costs[1]+solve(freq,costs,i+7);
		int c=costs[2]+solve(freq,costs,i+30);	
		return dp[i]=Math.min(a,Math.min(b,c));
	}

}
