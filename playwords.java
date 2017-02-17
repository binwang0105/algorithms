https://www.hackerrank.com/challenges/strplay/editorial


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Dec101_C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int[][] L = new int[n][n];
        for (int i = 0; i < n; i++)
            L[i][i] = 1;

        // Build the table. Note that the lower diagonal values of table are
        // useless and not filled in the process. The values are filled in a
        // manner similar to Matrix Chain Multiplication DP solution (See
        // http://www.geeksforgeeks.org/archives/15553). cl is length of
        // substring
        int i = 0;
        int j = 0;
        int cl = 0;
        for (cl=2; cl<=n; cl++)
        {
            for (i=0; i<n-cl+1; i++)
            {
                j = i+cl-1;
                if (str.charAt(i) == str.charAt(j) && cl == 2)
                    L[i][j] = 2;
                else if (str.charAt(i) == str.charAt(j))
                    L[i][j] = L[i+1][j-1] + 2;
                else
                    L[i][j] = Math.max(L[i][j - 1], L[i + 1][j]);
            }
        }
        int res = 0;
        for(i = 1; i < n; i++){
            int v1 = L[0][i - 1];
            int v2 = L[i][n - 1];
            res = Math.max(res, v1 * v2);

        }
        System.out.println(res);
    }
}
