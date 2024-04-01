class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res ="";

        int j=0;

        while(true){
            String ch = "";
            int counter= 1;
            for(int i=1;i<strs.length && j<strs[i].length()&&j<strs[i-1].length(); i++){
                if(strs[i].charAt(j)==strs[i-1].charAt(j)){
                    counter++;
                }
            }
            if(strs.length==counter && j<strs[0].length()){
                res+=String.valueOf(strs[0].charAt(j));
                j++;
            }else{
                break;
            }
        }

        return res;
    }
}