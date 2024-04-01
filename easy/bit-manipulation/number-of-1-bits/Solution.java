public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        if(n<0){
            count++;
            n+=Math.pow(2,31);
        }

        while(n!=0){
            if(n%2==1)
                count++;
            n/=2;
        }
        return count;

    }
}