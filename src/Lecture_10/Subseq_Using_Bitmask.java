package Lecture_10;

public class Subseq_Using_Bitmask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		int n=s.length();
		for(int i=0;i<((1<<n));i++) {  // loop from 0-(2.pow(n))-1
			String ans="";
			for( int j=0;j<n;j++) {
				int mask=1<<j;
				if((i&mask)!=0) {
					ans+=s.charAt(j);
				}
			}
			System.out.println(ans);
		}
	}

}
