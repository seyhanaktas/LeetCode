class Solution {
    public String longestPalindrome(String s) {
        String[] ss = s.split("");

        String res="";

        for(int i=0;i< ss.length; i++){
            int r =i+1;
            int l = i-1;
            String item = ss[i];
            while(l>=0 && ss[i].equals(ss[l])){
                item=ss[l]+item;
                l--;
            }
            while(r<ss.length && ss[i].equals(ss[r])){
                item+=ss[r];
                r++;
            }
            while(l>=0 && r<ss.length && ss[l].equals(ss[r])){
                item=ss[l]+item+ss[r];
                l--;
                r++;
            }

            if(res.length()<item.length()){
                res=item;
            }
        }
        return res;
    }
}