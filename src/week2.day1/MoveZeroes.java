package week2.day1;

import org.junit.Test;

public class MoveZeroes {

	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining
	 * the relative order of the non-zero elements.
	 * 
	 * Note that you must do this in-place without making a copy of the array.
	 */

	@Test
	public void example() {
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
	}

	private void moveZeroes(int[] nums) {
		int element = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
	        	element++; 
            }
            else if (element > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-element]=t;
            }
        }
    }

}
