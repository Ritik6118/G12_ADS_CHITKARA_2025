package Lecture_12;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		dp=new Integer[n+1];
		System.out.println(fibo(n));
		
	}
	static Integer[]dp;
	private static int fibo(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n]!=null) {
			return dp[n];
		}
		int a=fibo(n-1);
		int b=fibo(n-2);
		return dp[n]=a+b;
	}

}
