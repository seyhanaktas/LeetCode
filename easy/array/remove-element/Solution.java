class Solution {
    public int removeElement(int[] nums, int val) {
        int s = 0;
        int e= nums.length -1;
        int count=0;

        while(s<nums.length && s<=e && nums[s]!=-1){
            if(nums[s]==val){
                nums[s]=nums[e];
                nums[e]=-1;
                e--;
            }else{
                s++;
                count++;
            }
        }
        return count;
    }
}