class Solution {
    public int majorityElement(int[] nums) {
        int ci=0;
        int ni =0;
        int counter= 1;
        int n = nums.length;
        int out = nums[0];

        for(int i=1;i< nums.length; i++){
            if(out==nums[i]){
                counter++;
            }else{
                if(n-i-1 + counter <= n*1.0/2.0){
                    i = ni;
                    out= nums[ni];
                    counter=1;
                    ci = ni;
                }else if(ni==ci){
                    ni=i;
                }
            }
        }
        return out;
    }
}