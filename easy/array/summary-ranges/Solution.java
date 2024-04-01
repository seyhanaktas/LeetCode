class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res =new ArrayList<String>();
        if(nums.length==0)
            return res;
        int startIndex = 0;
        String item = ""+nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]-nums[i-1]!=1){
                if(startIndex<i-1){
                    item+="->"+nums[i-1];
                }
                res.add(item);
                item=""+nums[i];
                startIndex=i;
            }
            if(i == nums.length -1){
                if(startIndex<i){
                    item+="->"+nums[i];
                }
            }
        }
        res.add(item);
        return res;
    }
}