package week4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sqrtx {

    /*
    https://leetcode.com/problems/sqrtx/description/
     */

    @Test
    public void Binarysearch_run()
    {
        int x = 4;
        int expected_sqrt = 2;
        int sqrt_val = BinarySearch_sqrtofX(x);
        Assertions.assertEquals(expected_sqrt,sqrt_val);
    }

    @Test
    public void test1()
    {
        int x = 4;
        int expected_sqrt = 2;
        int sqrt_val = sqrtofX(x);
        Assertions.assertEquals(expected_sqrt,sqrt_val);
    }

    @Test
    public void test2()
    {
        int x = 1;
        int expected_sqrt = 1;
        int sqrt_val = sqrtofX(x);
        Assertions.assertEquals(expected_sqrt,sqrt_val);
    }

    @Test
    public void test3()
    {
        int x = -25;
        int expected_sqrt = -1;
        int sqrt_val = sqrtofX(x);
        Assertions.assertEquals(expected_sqrt,sqrt_val);
    }


    //Brute force approach
    public int sqrtofX(int x)
    {
        if(x<0)
            return -1;
        if (x<2)
            return x;
        int i =2;
        while(i*i<=x)
        {
            i++;
        }

        return --i;
    }

    //Binary search
    public int BinarySearch_sqrtofX(int x){
        if(x<0)
            return -1;
        if(x==1||x==2)
            return x;

        int left = 2, right = x/2;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid)
                left = mid + 1; // Too small or exact, narrow search to the right half
             else
                right = mid - 1; // Too big, narrow search to the left half

        }
        return right;
    }
}
