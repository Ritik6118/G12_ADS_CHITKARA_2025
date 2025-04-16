package Lecture_10;

public class count_set_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int c = 0;
//		while(n>0) {
//			if((n&1)==1) {
//				c++;
//			}
//			n>>=1;
//		}

		while (n > 0) {
			c++;
			n = (n & (n - 1));
		}
		System.out.println(c);
	}

}
