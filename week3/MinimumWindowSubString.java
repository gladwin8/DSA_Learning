package week3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumWindowSubString {

    @Test
    public void test()
    {
        String s = "ADOBECODEBANC", t = "ABC";
        String mw_String =minimumwindow_Substring(s,t);
        Assertions.assertEquals("BANC",mw_String);
    }



    public String minimumwindow_Substring(String s, String t)
    {
        if(s.length()<t.length())
        {
            return "";
        }

        int[] freq = new int[128];

        for(char c : t.toCharArray())
        {
            freq[c]++;
        }

        int left =0,right =0;
        int needed = t.length();
        int minstart = 0;
        int minlength = Integer.MAX_VALUE;

        while(right < s.length()) {
            char r = s.charAt(right);
            if (freq[r] > 0) {
                needed--;
            }
            freq[r]--;
            right++;

            while (needed == 0) {
                if (right - left < minlength) {
                    minlength = right - left;
                    minstart = left;
                }


                char ch = s.charAt(left);
                freq[ch]++;
                if (freq[ch] > 0)
                    needed++;
                left++;
            }
        }
        if (minlength == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(minstart,minstart+minlength);
    }
}
