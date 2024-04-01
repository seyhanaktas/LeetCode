class Solution {
    public int[] plusOne(int[] digits) {
        int remainder= 1;
        for(int i =digits.length -1; i>=0 && remainder>0;i--){
            digits[i]+=1;
            remainder= digits[i]/10;
            digits[i]=digits[i]%10;
        }
        if(remainder>0){
            int[] res = new int[digits.length+1];
            res[0]=1;
            for(int i=0;i<digits.length;i++){
                res[i+1]=digits[i];
            }
            return res;
        }
        return digits;
    }
}