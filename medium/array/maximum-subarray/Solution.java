class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=(int)Math.pow(10,4)*-1-1;
        int sum=(int)Math.pow(10,4)*-1-1;

        for(int i=0;i< nums.length;i++){
            currentSum= Math.max(nums[i],currentSum+nums[i]);

            if(currentSum>sum)
                sum=currentSum;
        }
        return sum;
    }
}