class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] a1=new int[1001];
        int[] a2 =new int[1001];

        int maxLength= nums1.length>nums2.length?nums2.length:nums1.length;
        List<Integer> result=new ArrayList<Integer>();

        for(int i=0;i<nums1.length;i++){
            a1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            a2[nums2[i]]++;
        }

        for(int i=0;i<a1.length; i++){
            if(a1[i]>0 && a2[i]>0)
            {
                int minOccurence= a1[i]>a2[i]?a2[i]:a1[i];
                while(minOccurence-->0){
                    result.add(i);
                }
            }
        }
        int[] res = new int[result.size()];
        for(int i=0;i<result.size();i++)
            res[i]=result.get(i);
        return res;
    }
}