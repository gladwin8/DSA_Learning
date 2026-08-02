package week6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class StringGreat
{
    @Test
    public void test1()
    {
        String s = "leEeetcode";
        String goodString = makeStringGreat(s);
        System.out.println(goodString);
        Assertions.assertEquals("leetcode",goodString);
    }

    @Test
    public void test2()
    {
        String s = "abBAcC";
        String goodString = makeStringGreat(s);
        System.out.println(goodString);
        Assertions.assertEquals("",goodString);
    }

    public String makeStringGreat(String s)
    {
        Stack<Character> stack = new Stack<>();
        String answer;
        char[] ch = s.toCharArray();
        for (int i = 0;i< ch.length;i++) {
            char curr = ch[i];
            if (!stack.isEmpty() && Math.abs(curr - stack.peek()) == 32)
            {
                stack.pop();
            }
            else
                stack.push(curr);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack)
                sb.append(c);

        return sb.toString();
    }
}


