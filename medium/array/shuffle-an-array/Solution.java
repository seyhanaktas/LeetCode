class Solution {

    private int[] nums;
    public Solution(int[] nums) {
        this.nums= nums;
    }

    public int[] reset() {
        return this.nums;
    }

    public int[] shuffle() {
        int[] res= new int[nums.length];

        List<Integer> indexes = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
            indexes.add(i);

        Random rand = new Random();
        for(int i=0;i<res.length; i++){
            int randomNumber= rand.nextInt(indexes.size());
            int index = indexes.get(randomNumber);
            indexes.remove(randomNumber);
            res[i]=nums[index];
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */