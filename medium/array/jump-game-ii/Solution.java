class Solution {
    public int jump(int[] nums) {
        int step = 0;
        for(int i=0;i<nums.length-1;i++){
            step++;
            int jump= nums[i];
            int maxIndex = i+jump;
            for(int j=jump-1; j>0 && maxIndex<nums.length-1; j--){
                if(nums[maxIndex] < nums[i+j] && nums[i+j]+i+j>nums[maxIndex]+maxIndex){
                    maxIndex = i+j;
                }
            }
            i= maxIndex-1;
        }
        return step;
    }
}