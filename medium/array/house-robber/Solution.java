class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);

        int[] sums= new int[nums.length];

        sums[0]=nums[0];
        sums[1]=nums[1];
        sums[2]=nums[0]+nums[2];
        for(var i=3;i<nums.length;i++){
            sums[i]=Math.max(sums[i-3], sums[i-2])+nums[i];
        }

        return Math.max(sums[nums.length-1], sums[nums.length-2]);
    }

    public int rob(int start, int[] nums){
        if(start>= nums.length)
            return 0;

        return Math.max(nums[start]+rob(start+2,nums), rob(start+1,nums));
    }
}