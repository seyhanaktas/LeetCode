class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        HashMap<Integer,List<Integer>> numsh = new HashMap<Integer,List<Integer>>();

        for(int i=0;i< nums.length; i++){
            if(!numsh.containsKey(nums[i]))
            {
                List<Integer> l = new ArrayList<Integer>();
                l.add(i);
                numsh.put(nums[i],l);
            }else{
                numsh.get(nums[i]).add(i);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(target-nums[i]==nums[i]){
                if(numsh.get(target-nums[i]).size()==2){
                    List<Integer> l=numsh.get(target-nums[i]);
                    res[0]=l.get(0);
                    res[1]=l.get(1);
                    break;
                }
            }else if(numsh.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=numsh.get(target-nums[i]).get(0);
                break;
            }
        }

        return res;
    }
}