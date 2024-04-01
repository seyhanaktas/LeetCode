class Solution {
    public void moveZeroes(int[] nums) {
        int numZeros=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]==0)
                numZeros++;
            else if(numZeros>0){
                nums[i-numZeros] = nums[i];
                nums[i]=0;
            }
        }

    }
    public void moveZeroes0(int[] nums) {
        for(int i=nums.length -2;i>=0;i--){
            if(nums[i]==0){
                int j = i+1;

                while(j<nums.length && nums[j]!=0){
                    j++;
                }
                int target=j-1;

                for(int k=i; k<target;k++){
                    nums[k]=nums[k+1];
                }
                nums[target] =0;
            }

        }
    }
}