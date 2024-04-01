class Solution {
    public boolean canJump(int[] nums) {

        int i=0;
        while(i<nums.length-1){
            if(nums[i]==0){
                int j=1;
                boolean found=false;
                while(i-j>=0){
                    if(nums[i-j]>j){
                        found =true;
                        break;
                    }
                    j++;
                }
                if(!found){
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}