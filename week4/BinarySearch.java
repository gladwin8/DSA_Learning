package week4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearch {
    //https://leetcode.com/problems/binary-search/description/

    @Test
    public void test1()
    {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int expected_index = 4;
        int target_index = binarySearch(nums,target);
        Assertions.assertEquals(expected_index,target_index);
    }

    public int binarySearch(int[] nums,int target)
    {
        int low = 0, high = nums.length;

        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]==target)
                return mid;
            else if (nums[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}
