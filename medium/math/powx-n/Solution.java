class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        int sign= 1;
        double nn = n;
        if(x<0){
            x=Math.abs(x);
            if(n%2==1)
                sign=-1;
        }

        if(n<0)
        {
            nn= Math.abs(nn);
            x= 1.0/x;
        }

        double mult= x;
        int powerCount = 1;
        while(nn>0){
            res*=mult;
            nn-=powerCount;
            if(nn>powerCount){
                if(nn>powerCount*2){
                    powerCount*=2;
                    mult*=mult;
                }
            }else{
                mult= x;
                powerCount = 1;
            }
        }

        return res*sign;
    }
}