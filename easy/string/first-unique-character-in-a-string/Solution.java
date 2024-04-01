class Solution {
    public int firstUniqChar(String s) {
        char[] ch =s.toCharArray();
        int[] uniques= new int[26];

        for(int i=0;i< uniques.length;i++){
            uniques[i]=-1;
        }

        for(int i=0;i<ch.length;i++){
            if(uniques[(int)ch[i]-97]==-1){
                uniques[(int)ch[i]-97]=i;
            }else{
                uniques[(int)ch[i]-97]=Integer.MAX_VALUE;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<uniques.length; i++){
            if(uniques[i]!=-1 && min>uniques[i])
                min=uniques[i];
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}