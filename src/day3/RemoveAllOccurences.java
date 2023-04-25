package day3;

import org.junit.Test;

public class RemoveAllOccurences {
	
	
	//Problem
	
	/**
	 * Remove all occurrence of a number 
	which is present in the given index number
	 */
	

	@Test
	public void example1() {
		int[] arr = {8,1,2,4,1,4,1,4};
		int indexToRemove = 3;
		removeAllOccurences(arr, indexToRemove);
	}

	private void removeAllOccurences(int[] arr, int indexToRemove) {
		int[] arr1 = new int[arr.length];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != arr[indexToRemove]) {
				arr1[j] = arr[i];
				j++;
			}
		}

		for (int k = 0; k < arr1.length; k++) {
			if (arr1[k] != 0) {
				System.out.print(arr1[k]);
			} else
				break;
		}
	}

}
