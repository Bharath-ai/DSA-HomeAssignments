package week2.day2;

import org.junit.Test;

public class RemoveElement {

	@Test
	public void example() {
		int[] arr = { 0, 1, 2, 2, 3, 0, 4, 5 };
		int target = 2;
		removeElement(arr, target);
	}

	private void removeElement(int[] arr, int target) {
		int left = 0, right = arr.length - 1, temp = 0;

		while (left < right) {
			if (arr[left] != target) {
				arr[left] = arr[left];
				left++;

			} else {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		for (int output : arr)
			System.out.print(output);

	}

}
