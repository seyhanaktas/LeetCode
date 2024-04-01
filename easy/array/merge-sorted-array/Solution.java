class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int endIndex = nums1.length -1;
        int startIndex= m-1;

        int i2= nums2.length-1;

        while(i2 >=0 && startIndex>=0){
            if(nums2[i2]>nums1[startIndex]){
                nums1[endIndex]=nums2[i2];
                i2--;
            }else{
                nums1[endIndex]=nums1[startIndex];
                startIndex--;
            }
            endIndex--;
        }

        while(endIndex>=0&&i2>=0){
            nums1[endIndex]=nums2[i2];
            i2--;
            endIndex--;
        }
    }
}