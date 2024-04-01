class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            int n = i+1;
            List<Integer> innerList= new ArrayList<Integer>();
            for(int j = 0;j<n;j++){
                int val=1;
                if(j>0 && j<n-1){
                    val= res.get(i-1).get(j-1)+res.get(i-1).get(j);
                }
                innerList.add(val);
            }
            res.add(innerList);
        }
        return res;
    }
}