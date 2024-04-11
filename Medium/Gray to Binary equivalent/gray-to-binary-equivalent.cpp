//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
    public:
    // function to convert a given Gray equivalent n to Binary equivalent.
     int grayToBinary(int n)
    {
         // Your code here
        int ans=0;
          vector<int>v;
          if(n==0){
              v.push_back(0);
          }
          while(n!=0){
              v.push_back(n%2);
              n=n/2;
          }
          reverse(v.begin(),v.end());
          int j=v.size()-1;
          int val=0;
        for(int i=0;i<v.size();i++){
            val=val^v[i];
            ans+=val *pow(2,j);
            j--;
        }
        return ans;
    }
};

//{ Driver Code Starts.

// Driver code
int main()
{
    int t,n;
    cin>>t;//testcases
    while(t--)
    {
        cin>>n;//initializing n
        
        Solution ob;
        //calling function grayToBinary()
       cout<< ob.grayToBinary(n)<<endl;
    }
}

// } Driver Code Ends