package com.shivit;

public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicates(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int k = removeDuplicates(nums);

		System.out.print("Output: " + k);
		System.out.print(", nums = [");
		for (int i = 0; i < k; i++) {
			System.out.print(nums[i] + (i == k - 1 ? "" : ","));
		}
		for (int i = k; i < nums.length; i++) {
			System.out.print(i == k ? ",_" : ",_");
		}
		System.out.println("]");
	}

}
