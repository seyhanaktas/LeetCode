class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minCount=0;
        int sum =0;
        int r=0;
        for( ;r< nums.length && sum < target; r++){
            minCount++;
            sum+=nums[r];
        }
        if(sum<target)
            return 0;

        int l =0;
        int count=minCount;
        while(r<nums.length || l<nums.length ){
            if(l<nums.length && sum-nums[l]>=target){
                count--;
                sum-=nums[l++];
            }else if(r<nums.length && l<nums.length && sum-nums[l]+nums[r]>=target){
                sum-=nums[l++];
                sum+=nums[r++];
            }else if(r<nums.length){
                sum+=nums[r++];
                count++;
            }else{
                break;
            }
            if(count<minCount && sum >= target)
                minCount=count;
        }

        return minCount>nums.length?0:minCount;
    }
}