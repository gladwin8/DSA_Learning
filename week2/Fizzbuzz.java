package week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fizzbuzz {
    @Test
    public void test1()
    {
        int n = 3;
        List<String> ans = fizzbuzz(n);
        Assertions.assertArrayEquals(new String[]{"1", "2", "Fizz"},ans.toArray());
    }

    public List<String> fizzbuzz(int n)
    {
        List<String> list = new ArrayList<>();
        for (int i = 1;i<=n;i++)
        {
            if (i%15 == 0)
                list.add("FizzBuzz");
            else if (i%3==0)
                list.add("Fizz");
            else if (i%5==0)
                list.add("Buzz");
            else
                list.add(String.valueOf(i));
        }
        return list;
    }
}
