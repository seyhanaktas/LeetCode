class Solution {
    public int strStr(String haystack, String needle) {
        int j=0;
        for(int i=0;i<haystack.length(); i++){
            if(needle.charAt(j)==haystack.charAt(i)){
                j++;

                if(j==needle.length()){
                    return i-j+1;
                }
            }else{
                i=i-j;
                j=0;
            }
        }
        return -1;
    }
}