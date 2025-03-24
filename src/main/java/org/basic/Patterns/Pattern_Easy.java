package org.basic.Patterns;

public class Pattern_Easy {

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

    Pattern 4
    Given an integer n. You need to recreate the pattern given below for any value of N.
    Let's say for N = 5, the pattern should look like as below:

    1
    22
    333
    4444
    55555

    Pattern 5
    Given an integer n. You need to recreate the pattern given below for any value of N.
    Let's say for N = 5, the pattern should look like as below:

    *****
    ****
    ***
    **
    *

    Pattern 6
    Given an integer n. You need to recreate the pattern given below for any value of N. 4
    Let's say for N = 5, the pattern should look like as below:

    12345
    1234
    123
    12
    1
    
    */

    public static void main(String[] args) {
        int n=5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);
        System.out.println();


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

    public static void pattern4(int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n)
    {
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}