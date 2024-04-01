class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dup =new HashSet<Integer>();

        for(int i=0;i< nums.length; i++)
            dup.add(nums[i]);

        return nums.length>dup.size();
    }
}