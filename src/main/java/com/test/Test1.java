package com.test;
//https://www.geeksforgeeks.org/find-the-smallest-number-whose-sum-of-digits-is-n/
public class Test1 {

    static int getSum(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    // Function to find the smallest
// number whose sum of digits is also N
    static void smallestNumber( int N)
    {
        int i = N+1;
        int sum= getSum(N);
        while (1 != 0)
        {
            if (getSum(i) == sum )
            {
                System.out.print(i);
                break;
            }
            i++;
        }
    }

    static void smallestNumber1(int N)
    {
        System.out.print((N % 9 + 1) *
                Math.pow(10, (N / 9)) - 1);
    }
    // Driver code
    public static void main(String[] args)
    {
      //  int N = getSum(734);
       // int N = 14;
        smallestNumber(734);
    }

}
