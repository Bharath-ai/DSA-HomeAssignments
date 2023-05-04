package week2.day4;

import org.junit.Test;

public class SortArrayByParity {
	@Test
	public void example() {
		int[] arr = {2,2,2,2};
		sortArrayByParity(arr);
	}

	private void sortArrayByParity(int[] arr) {
		int ptr1=0,ptr2=0, temp=0;
		while(ptr2<arr.length) {
			if(arr[ptr2] % 2 != 0)
			{
				ptr2++;
			}
			else {
				temp = arr[ptr2];
				arr[ptr2++] = arr[ptr1];
				arr[ptr1++] = temp;
			}
		}
		
		System.out.println(String.valueOf(arr));
		
	}
}
