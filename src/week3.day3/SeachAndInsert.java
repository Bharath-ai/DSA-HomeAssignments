package week3.day3;

import org.junit.Test;

public class SeachAndInsert {

	@Test
	public void test1() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		System.out.println(searchAndInsert(nums, target));
	}

	@Test
	public void test2() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		System.out.println(searchAndInsert(nums, target));
	}

	@Test
	public void test3() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		System.out.println(searchAndInsert(nums, target));
	}

	private int searchAndInsert(int[] nums, int target) {
		int left = 0, right = nums.length - 1, mid;

		while (left <= right) {
			mid = (left + right) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;

	}

}
