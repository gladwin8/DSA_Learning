package week5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSort {


    @Test
    public void test1()
    {
        int[] nums = {4,2,5,8,1};
        int[] bubble = bubbleSorted(nums);
        Assertions.assertArrayEquals(new int[]{1,2,4,5,8}, bubble);
    }

    public int[] bubbleSorted(int[] nums)
    {
        for (int i = 0; i < nums.length-1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    //swap it
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped)
                break;
        }
        return nums;
    }
}
