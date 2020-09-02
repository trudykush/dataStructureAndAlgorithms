package august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
*
Rotate Array
Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).

Input:
The first line of the input contains T denoting the number of testcases.
First line of each test case contains two space separated elements, N denoting the size of the array and an integer D
denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

Output:
For each testcase, in a new line, output the rotated array.

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 105

Example:
Input:
2
5 2
1 2 3 4 5
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
*
* */
public class RotateArray {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0)
        {
            int N = in.nextInt();
            int D = in.nextInt();
            int a[]= new int[N];
            for(int i=0; i<N; i++)
            {
                a[i] = in.nextInt();
            }
            StringBuffer s = new StringBuffer();
            for(int i=D; i<N; i++ )
            {
                s.append(a[i]+" ");
            }
            for(int i=0;i<D;i++)
            {
                s.append(a[i]+" ");
            }
            System.out.println(s);
        }

    }

    private static void rotateArrayAndPrint(int[] arr, int d, int n) {

        d = d % n;
        int i, j, k, temp;
        int _gcd = gcd(d, n);

        for (i=0; i<_gcd; i++) {

            temp = arr[i];
            j  = i;
            while (true) {
                k = j + d;
                if (k >= n);
            }
        }

    }

    static int gcd(int a, int b) {
        if(b==0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
}
