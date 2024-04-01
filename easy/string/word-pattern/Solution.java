class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] ss = s.split(" ");
        if(ss.length !=pattern.length())
            return false;
        HashMap<String,String> map1=new HashMap<String,String>();
        HashMap<String,String> map2=new HashMap<String,String>();
        String[] p=pattern.split("");

        for(int i=0;i<ss.length; i++){
            if(!map1.containsKey(p[i])){
                map1.put(p[i],ss[i]);
            }
            if(!map2.containsKey(ss[i])){
                map2.put(ss[i],p[i]);
            }

            if(!map1.get(p[i]).equals(ss[i]) || !map2.get(ss[i]).equals(p[i]))
                return false;
        }
        return true;

    }
}