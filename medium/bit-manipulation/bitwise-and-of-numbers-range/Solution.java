class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int sum =left&right;
        int i= right-1;
        int decr = 1;
        while(i>left && sum>0){
            sum&=i;
            int temp = i;
            int twosLevel=1;
            while(temp%2==0){
                twosLevel*=2;
                temp/=2;
            }
            if(decr<twosLevel)
               decr=twosLevel ;
            i-=decr;
        }
        return sum;
    }
}