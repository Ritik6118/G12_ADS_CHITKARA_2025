package Lecture_10;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int singleNumber(int[] nums) {
		int ans = nums[0];
		for (int i = 1; i < nums.length; i++) {
			ans ^= nums[i];
		}
		return ans;
	}

}
