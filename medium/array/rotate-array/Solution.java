class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==0)
            return;
        k= k%nums.length;
        if(k==0)
            return;

        int right= nums.length-k-1;
        int left=0;
        while(left<right){
            int temp= nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        }

        right= nums.length-1;
        left=nums.length-k;
        while(left<right){
            int temp= nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        }


        for(int i=0;i<nums.length/2;i++){
            int temp= nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }


    }
}