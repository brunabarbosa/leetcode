package easy;

import java.util.Arrays;

public class MoveZeroes {
    public int[] moveZeroes(int[] nums) {
    	for (int i = nums.length - 1; i > 0; i--) {
    		for (int j = nums.length - 1; j > 0; j--) {
				if (nums[j - 1] == 0) {
					swap(j - 1, j, nums);
				}
			}
        }
    	return nums;
    }
    
    private void swap(int i, int j, int[] nums) {
    	int aux = nums[i];
    	nums[i] = nums[j];
    	nums[j] = aux;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new MoveZeroes().moveZeroes(new int[] {0, 1, 0, 3, 12})));
	}
}
