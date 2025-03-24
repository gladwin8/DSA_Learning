package org.basic.Patterns;

public class Pattern_Medium {

    /*
    Pattern 1
    Given an integer n. You need to recreate the pattern given below for any value of N.
    Let's say for N = 5, the pattern should look like as below:

        *
       ***
      *****
     *******
    *********

     */
    public static void main(String[] args)
    {
        int n=5;
        pattern1(n);
    }

    public static void pattern1(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n; j++)
            {
                System.out.println();
            }
        }
    }
}
