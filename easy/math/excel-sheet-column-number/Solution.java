class Solution {
    public int titleToNumber(String columnTitle) {
        int result= 0;
        int multiplier= 1;
        for(int i=columnTitle.length()-1;i>=0; i--){
            result +=((int)columnTitle.charAt(i)-(int)'A'+1)*multiplier;
            multiplier*=26;
        }
        return result;
    }
}