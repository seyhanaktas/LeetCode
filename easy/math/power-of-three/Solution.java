class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0)
            return false;
        double pow = Math.log(n)/Math.log(3);

        return Math.abs(pow-Math.round(pow)) < 1e-10;
    }
}