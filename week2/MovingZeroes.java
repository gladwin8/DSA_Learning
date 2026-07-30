package week2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MovingZeroes {
    //https://leetcode.com/problems/move-zeroes/
    @Test
    public void test1()
    {
        int[] nums = {0,1,0,3,12};
        movingzerostoEnd(nums);
        System.out.println(Arrays.toString(nums));
    }

    //Better Approach
    public void movingzerostoEnd(int[] nums)
    {
        int left = 0;
        for (int right = 0;right<nums.length;right++)
        {
            if (nums[right]!=0)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }

    //Brute force
    public void movingzerostoEnd1(int[] nums){
        int left = 0,right = 1;
        while(right<nums.length)
        {
            if (nums[left]==0 && nums[right]!=0 )
            {
                //swap
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                //increment left & right
                left++;
                right++;
                continue;
            }
            if(nums[left]==0 && nums[right]==0)
            {
                //increment right
                right++;
                continue;
            }
            //if left !=0 & right=left, increment left & right
            if(nums[left]!=0 && right==left)
            {
                left++;
                right++;
                continue;
            }
            //if left !=0 & right!=left, increment left
            if(nums[left]!=0 && right!=left)
            {
                left++;
                continue;
            }
        }
    }


}
