//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.countNumberswith4(n);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    
    private static boolean containsDigitFour(int number) {
        String strNumber = String.valueOf(number);
        return strNumber.contains("4");
    }
    
    public static int countNumberswith4(int n) {
        int count=0;
        for (int i = 1; i <= n; i++) {
            if (containsDigitFour(i)) {
                count++;
            }
        }
        return count;
    }
    
}
