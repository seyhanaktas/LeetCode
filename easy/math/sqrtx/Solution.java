class Solution {
    public int mySqrt(int x) {
        if(x<=0)
            return 0;
        if(x==1)
            return 1;

        int y = 1;

        while(x/y>y)
            y*=2;

        while(x/y<y)
            y--;

        return y;
    }
}