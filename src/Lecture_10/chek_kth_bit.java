package Lecture_10;

public class chek_kth_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=1;
//		int mask=(1<<k);
		int mask=(int) Math.pow(2,k);
		if((n&mask)!=0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
