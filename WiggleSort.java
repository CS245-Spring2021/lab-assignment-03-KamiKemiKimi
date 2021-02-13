/**
 * NO EXTERNAL LIBRARIES OR PACKAGES SHOULD BE IMPORTED
 * Sorts an array into WiggleSort format
 *
 * @author Alex Kim
 */
public class WiggleSort {
    /**
     * Given an integer array nums, reorders it such that nums[0] < nums[1]  >  nums[2] <  nums[3]...
     * @param nums array to sort
     * @return sorted array
    */
    public static int[] wiggleSort(int[] nums) {
    	//insertion sort
    	for (int i = 1; i < nums.length; i++)
    	{
    		//copy
    		int temp = nums[i];
    		int j = i - 1;
    		
    		//reassign
    		while(j >= 0 && nums[j] > temp)
    		{
    			nums[j+1] = nums[j];
    			--j;
    		}
    		
    		//re-copy
    		nums[j+1] = temp;
    	}
    	
    	//wiggle sort
    	int [] arr = new int[nums.length];
    	int low = 0;
    	int high = arr.length - 1;
    	
    	//determine whether we use lower or high number with boolean
    	boolean lower = true;
    	
    	for (int j = 0; j < arr.length; j++)
    	{
    		if (lower)
    		{
    			arr[j] = nums[low];
    			low++;
    			lower = false;
    		}
    		else if (!lower)
    		{
    			arr[j] = nums[high];
    			high--;
    			lower = true;
    		}	
    	}
    	
    	//return new array
    	return arr;
    }
}