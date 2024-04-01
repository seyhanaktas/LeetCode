class Solution {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;

        int[] s =new int[n];
        s[0]=1;
        s[1]=2;
        int top= 2;

        while(top<n){
            s[top]=s[top-1]+s[top-2];
            top++;
        }

        return s[n-1];
    }


}