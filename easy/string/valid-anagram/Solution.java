class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] l =new int[26];

        int limitNum= 50001;

        for(int i=0;i< l.length;i++)
            l[i]=limitNum;
        for(int i=0;i<s.length();i++){
            int si= (int)s.charAt(i)-97;
            int ti= (int)t.charAt(i)-97;
            if(l[si]==limitNum)
                l[si]=0;
            if(l[ti]==limitNum)
                l[ti]=0;

            l[si]++;
            l[ti]--;
        }

        for(int i=0;i<l.length; i++){
            if(l[i]!=limitNum && l[i]!=0)
                return false;
        }
        return true;
    }
}