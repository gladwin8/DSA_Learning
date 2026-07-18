package week4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPeakElement {
    @Test
    public void test(){
        int[] nums = {1,2,1,3,5,6,4};
        int expected_peakIndex = 5;
        int peakIndex = findPeak(nums);
        Assertions.assertEquals(expected_peakIndex,peakIndex);
    }

    public int findPeak(int[] nums)
    {
        if(nums[0]>nums[1])
            return 0;
        int last = nums.length-1;
        if(nums[last]>nums[last-1])
            return last;
        int low = 0,high = last;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
                return mid;
            else if (nums[mid]<nums[mid+1])
                low = mid+1;
            else //nums[mid]>nums[mid-1]
                high = mid-1;
        }
        return -1;
    }

}
