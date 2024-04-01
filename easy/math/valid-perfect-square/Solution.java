class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<=0)
            return false;
        if(num==1)
            return true;

        int y = 1;

        while(num/y>y)
            y*=2;

        while(num/y<y)
            y--;

        return y*y==num?true:false;
    }
}