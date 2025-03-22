package org.basic.Patterns;

public class Pattern1 {

    /*
    Pattern 1
    Given an integer n. You need to recreate the pattern given below for any value of N.
    Let's say for N = 5, the pattern should look like as below:
            *****
            *****
            *****
            *****
            *****

    Pattern 2
    Given an integer n. You need to recreate the pattern given below for any value of N.
    Let's say for N = 5, the pattern should look like as below:

    *
    **
    ***
    ****
    *****

    Pattern 3
    Given an integer n. You need to recreate the pattern given below for any value of N. 
    Let's say for N = 5, the pattern should look like as below:
    1
    12
    123
    1234
    12345

    */

    public static void main(String[] args) {
        int n=5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);


    }



    public static void pattern1(int n)
    {
        for (int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void pattern3(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}