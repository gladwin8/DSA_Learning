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

    Pattern 2
    Given an integer n. You need to recreate the pattern given below for any value of N.
    Let's say for N = 5, the pattern should look like as below:

    *********
     *******
      *****
       ***
        *

    Pattern 3

    Given an integer n. You need to recreate the pattern given below for any value of N.
    Let's say for N = 5, the pattern should look like as below:

        *
       ***
      *****
     *******
    *********
    *********
     *******
      *****
       ***
        *

    Pattern 4
    Given an integer n. You need to recreate the pattern given below for any value of N.
    Let's say for N = 5, the pattern should look like as below:

    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

    Pattern 5
    Given an integer n. You need to recreate the pattern given below for any value of N.
    Let's say for N = 5, the pattern should look like as below:

    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1

    Pattern 6
    Given an integer n. You need to recreate the pattern given below for any value of N.
    Let's say for N = 5, the pattern should look like as below:

    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15

    Pattern 7:
    Given an integer n. You need to recreate the pattern given below for any value of N.
    Let's say for N = 5, the pattern should look like as below:

    A
    AB
    ABC
    ABCD
    ABCDE

    */
    public static void main(String[] args)
    {
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
        pattern7(n);
    }

    public static void pattern1(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++)
            {
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n)
    {
        for (int i = n; i >=1 ; i--)
        {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1 ; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n)
    {
        pattern1(n);
        pattern2(n);
    }

    public static void pattern4(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n)
    {
        for (int i = 1; i <= n; i++) {
            int start = 1;
            if(i%2==0)
            {
                start = 0;
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(start+" ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pattern6(int n)
    {
        int temp=1;
        for (int i=1;i<=n;i++)
        {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp+" ");
                temp=temp+1;
            }
            System.out.println();
        }
    }

    public static void pattern7(int n)
    {
        for (int i=0;i<n;i++)
        {
            for (char ch='A';ch<='A'+i;ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
