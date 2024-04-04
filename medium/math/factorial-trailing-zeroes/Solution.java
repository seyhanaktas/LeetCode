class Solution {
    public int trailingZeroes(int n) {
        int divider= 5;
        int count=0;
        while(divider <=n){
            count+=n/divider;
            divider*=5;
        }
        return count;
    }
}