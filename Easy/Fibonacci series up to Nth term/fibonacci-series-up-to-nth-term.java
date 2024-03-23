//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    int[] Series(int n) {
             int[] fibonacciSeries = new int[n + 1];
        
        if (n >= 0)
            fibonacciSeries[0] = 0; // First term is 0
        
        if (n >= 1)
            fibonacciSeries[1] = 1; // Second term is 1
        
     for (int i = 2; i <= n; i++) {
        fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        fibonacciSeries[i] %= 1000000007; // Apply modulo 10^9 + 7
}
        return fibonacciSeries;
    }
}