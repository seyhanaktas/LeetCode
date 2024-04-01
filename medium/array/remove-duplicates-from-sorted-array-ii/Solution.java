class Solution {
    public int removeDuplicates(int[] nums) {
        int prevNum= nums[0];
        int appearance= 1;
        int ci = 1;
        for(int i=1;i<nums.length; i++){
            nums[ci]=nums[i];
            if(nums[i]==prevNum){
                appearance++;
                if(appearance<=2){
                    ci++;
                }
            }else{
                prevNum= nums[i];
                ci++;
                appearance=1;
            }
        }
        return ci;
    }
}