package week5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSort {

    @Test
    public void test1()
    {
        int[] nums = {4,7,1,2,-1};
        int[] selectionsortedArray = sortbySelection(nums);
        Assertions.assertArrayEquals(new int[]{-1,1,2,4,7},selectionsortedArray);
    }

    public int[] sortbySelection(int[] nums)
    {
        int minIndex,temp;
        for (int i = 0; i < nums.length-1; i++) {
            minIndex = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]<nums[minIndex])
                    minIndex = j;
            }

            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }
}
