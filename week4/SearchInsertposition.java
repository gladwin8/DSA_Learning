package week4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//https://leetcode.com/problems/search-insert-position/description
public class SearchInsertposition {

    //Positive testcase
    @Test
    public void test1()
    {
        int[] nums = {1,3,5,6};
        int target = 5;
        int expected_searchInsert = 2;
        int searchInsert = searchInsert(nums,target);
        Assertions.assertEquals(expected_searchInsert,searchInsert);
    }

    //Negative testcase
    @Test
    public void test2()
    {
        int[] nums = {1,3,5,6};
        int target = 2;
        int expected_searchInsert = 1;
        int searchInsert = searchInsert(nums,target);
        Assertions.assertEquals(expected_searchInsert,searchInsert);
    }

    public int searchInsert(int nums[],int target)
    {
        int left = 0,right = nums.length-1;
        while(left<=right)
        {
            int mid = left +(right-left)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                left = mid+1;
            else
                right = mid-1;
        }
        return left;
    }
}
