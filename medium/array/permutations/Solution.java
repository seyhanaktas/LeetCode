class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res =new  ArrayList<List<Integer>>();
        if(nums.length ==0)
            return res;
        if(nums.length ==1){
            res.add(new ArrayList<Integer>(){{add(nums[0]);}});
        }

        int[] tmp= new int[nums.length-1];
        for(int i=0;i< nums.length; i++){
            int index = 0;
            for(int j=0;j<nums.length; j++){
                if(i==j)
                    continue;
                tmp[index]= nums[j];
                index++;
            }
            List<List<Integer>> tmpList = permute(tmp);

            for(int j=0;j<tmpList.size();j++){
                List<Integer> listItem = new ArrayList<Integer>();
                listItem.add(nums[i]);
                listItem=Stream.concat(listItem.stream(), tmpList.get(j).stream()).collect(Collectors.toList());
                res.add(listItem);
            }

        }
        return res;

    }
}