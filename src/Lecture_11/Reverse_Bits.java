package Lecture_11;
import java.util.*;
public class Reverse_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Integer a=n;
		System.out.println(a.toBinaryString(n));
		int pos=0;
		int ans=0;
		while(n>0) {
			if((1&n)==1) {
				int mask=(1<<31-pos);
				ans|=mask;
			}
			n>>=1;
			pos++;
		}
		Integer b=ans;
		System.out.println(b.toBinaryString(ans));
		System.out.println(ans);
		
	}

}
