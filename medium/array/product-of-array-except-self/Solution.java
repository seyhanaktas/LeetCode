class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum =1;
        int zeroCount=0;
        for(int i=0;i< nums.length; i++){
            if(nums[i] ==0)
                zeroCount++;
            else
                sum*=nums[i];
        }

        for(int i =0;i<nums.length; i++){
            if(zeroCount>0){
                if(nums[i]==0 && zeroCount==1)
                    nums[i]=sum;
                else
                    nums[i]=0;
            }else{
                nums[i]=sum/nums[i];
            }
        }
        return nums;
    }
}