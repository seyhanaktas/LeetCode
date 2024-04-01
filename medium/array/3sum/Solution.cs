public class Solution {

    public IList<IList<int>> ThreeSum(int[] nums) {

        IList<IList<int>> res= new List<IList<int>>();
        if(nums.Length<3)
            return res;
        int minVal=nums[0];
        int maxVal= nums[0];
        for(int i=1;i<nums.Length; i++){
            if(minVal>nums[i]){
                minVal=nums[i];
            }
            if(maxVal<nums[i]){
                maxVal= nums[i];
            }
        }

        int[] hm= new int[maxVal-minVal+1];

        for(int i=0;i<nums.Length; i++){
            hm[nums[i]-minVal] =hm[nums[i]-minVal]+1;
        }

        for(int i=0;i<hm.Length; i++){
            if(hm[i]==0)
                continue;
            int val= i+minVal;
            for(int j=i; j<hm.Length; j++ ){
                if((hm[j]==0) || (i==j && hm[j]<2))
                    continue;
                int sVal= j+minVal;
                int pairSum= val+sVal;
                int thVal= -pairSum;
                if(thVal-minVal<j)
                    continue;
                if(thVal == sVal&& sVal==val && hm[j]<3){
                    continue;
                }else if((thVal == sVal && hm[j]<2) || (thVal ==val&& hm[i]<2)){
                    continue;
                }
                if(thVal-minVal<hm.Length && hm[thVal-minVal]>0){
                    res.Add(new List<int>(){val, sVal, thVal});
                }
            }
        }

        return res;
    }
}