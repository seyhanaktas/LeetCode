class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0)
            return false;
        for(int i=0;i<nums.length; i++){
            for(int j=1; j<=k && i+j<nums.length; j++){
                if(nums[i] == nums[i+j])
                    return true;
            }
        }
        return false;
    }
}