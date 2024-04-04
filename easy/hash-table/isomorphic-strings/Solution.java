class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<String,String> map = new HashMap<String, String>();
        HashMap<String,String> mapOpposite = new HashMap<String, String>();
        String[] ss =s.split("");
        String[] tt =t.split("");
        for(int i=0;i< ss.length; i++){
            if(map.containsKey(ss[i]) || mapOpposite.containsKey(tt[i]) ){
                if(!tt[i].equals(map.get(ss[i])) || !ss[i].equals(mapOpposite.get(tt[i])))
                    return false;                
            }else{
                map.put(ss[i],tt[i]);
                mapOpposite.put(tt[i],ss[i]);
            }
        }
        

        return true;
    }
}