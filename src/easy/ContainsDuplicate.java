package easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
    	Map<Integer, Boolean> duplicates = new HashMap<>();
    	
    	for (int i = 0; i < nums.length; i++) {
			if(duplicates.containsKey(nums[i])) {
				return true;
			}
			
			duplicates.put(nums[i], true);
		}
    	
    	return false;
    }
    
	public static void main(String[] args) {
		System.out.println(new ContainsDuplicate().containsDuplicate(new int[] {1, 2, 3}));
	}
}
