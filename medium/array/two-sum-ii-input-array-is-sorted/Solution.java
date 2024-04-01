class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a=0;
        int b=1;

        for(a=0;a<numbers.length-1; a++){
            b=a+1;
            while(b<numbers.length && numbers[a]+numbers[b]<target ){
                b++;
            }
            if(b<numbers.length && numbers[a]+numbers[b]==target){
                break;
            }
        }

        return new int[]{a+1,b+1};
    }
}