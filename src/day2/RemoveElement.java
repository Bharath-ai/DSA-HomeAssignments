package day2;

import org.junit.Test;

public class RemoveElement {

	@Test
	public void example() {
		int[] arr = { 1, 5, 4, 6, 5, 9 };
		int removeElement = 5;
		removeElementFromArray(arr, removeElement);
	}

	private void removeElementFromArray(int[] arr, int removeElement) {
		int[] arr1 = new int[arr.length-2];
		
		for(int i=0,j=0; i<arr.length;i++,j++)
		{
			if(arr[i]==removeElement)
			{
				arr1[j] = arr[i+1];
				i++;
				
			}
			else {
				arr1[j] = arr[i];
				
			}
		}
		
		for(int k=0; k<arr1.length; k++) {
			System.out.print(arr1[k]+",");
		}

	}

}
