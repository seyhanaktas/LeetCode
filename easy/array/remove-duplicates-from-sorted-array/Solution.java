class Solution {
    public int removeDuplicates(int[] nums) {
        int actualIndex= 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[actualIndex]){
                actualIndex++;
                nums[actualIndex]=nums[i];
            }
        }
        return actualIndex+1;

    }
}