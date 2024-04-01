class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend ==Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;

        int sign= (dividend>0 &&divisor>0) || (dividend<0 &&divisor<0)?1:-1;

        long absdividend = Math.abs((long)dividend);
        long absdivisor = Math.abs((long)divisor);

        long fastDivisor = absdivisor;
        int inc= 1;
        int quotient = 0;

        while(absdividend >= absdivisor){
            if(absdividend<fastDivisor)
            {
                fastDivisor=absdivisor;
                inc= 1;
            }
            absdividend-=fastDivisor;
            quotient+=inc;

            inc +=inc;
            fastDivisor+=fastDivisor;
        }


        return sign==1?quotient:0-quotient;
    }
}