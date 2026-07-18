package week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlusOne {


    /*
    PseudoCode :
    1. Traverse from the last element to first element of digits[].
    2. Check whether adding 1 to digit[i] does not exceed 10 , then increment with 1 and return digits[]
    3. If the element exceeds more than 10 , assign the particular element in the array as 0.
    Check until the last element of the array using For loop.
    4. If none of the element gets returned, edge case needs to be handled using creating a new array[arr.length+1]
    5. Assign the first index as 1 and keep the remaining as 0(default) and return the array.
     */

    //Positive case
    @Test
    public void test1(){
        int[] digits = {1,2,9};
        int[] expected_plusOne = {1,3,0};
        int[] plusOne = plus_One(digits);
        Assertions.assertArrayEquals(expected_plusOne,plusOne);
    }

    //Edge cases
    @Test
    public void test2(){
        int[] digits = {9,9,9};
        int[] expected_plusOne = {1,0,0,0};
        int[] plusOne = plus_One(digits);
        Assertions.assertArrayEquals(expected_plusOne,plusOne);
    }

    //Negative case
    @Test
    public void test3(){
        int[] digits = {2,1,-1};
        int[] expected_plusOne = {2,1,0};
        int[] plusOne = plus_One(digits);
        Assertions.assertArrayEquals(expected_plusOne,plusOne);
    }

    public int[] plus_One(int[] digits)
    {
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i]+1<10){
                digits[i]++;
                return digits;
            }
            else
                digits[i]=0;
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
