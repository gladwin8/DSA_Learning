package week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringRepeatingchar {

    /*

     */

    //Positive testcase
    @Test
    public void test1()
    {
        String s = "abcabcbb";
        int expected_MaximumSubstring = 3; //Output
        int actual_MaximumSubstring = longestSubstring(s);
        Assertions.assertEquals(expected_MaximumSubstring,actual_MaximumSubstring);
    }

    //Edge case
    @Test
    public void test2()
    {
        String s = "bbbb";
        int expected_MaximumSubstring = 1; //Output
        int actual_MaximumSubstring = longestSubstring(s);
        Assertions.assertEquals(expected_MaximumSubstring,actual_MaximumSubstring);
    }

    //Negative testcase
    @Test
    public void test3()
    {
        String s = "";
        int expected_MaximumSubstring = 0; //Output
        int actual_MaximumSubstring = longestSubstring(s);
        Assertions.assertEquals(expected_MaximumSubstring,actual_MaximumSubstring);
    }

    public int longestSubstring(String s){

        int max_length = 0 , left = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch))
            {
                set.remove(s.charAt(left));//delete the left element and slide the window to left
                left++;
            }

            set.add(ch);
            max_length = Math.max(max_length,right-left+1);
        }

        return max_length;
    }
}
