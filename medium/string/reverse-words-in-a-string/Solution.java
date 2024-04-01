class Solution {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        String res="";
        for(int i =ss.length-1; i>=0; i--){
            if(ss[i].trim().length()>0){
                res+=ss[i]+" ";
            }
        }
        return res.trim();
    }
}