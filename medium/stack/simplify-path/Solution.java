class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        Stack<String> s = new Stack<String>();

        for(String p: paths){
            if(!p.isEmpty())
            {
                if(p.equals("..")){
                    if(s.size()>0)
                        s.pop();
                }else if(!p.equals(".")){
                    s.push(p);
                }
            }
        }

        String result= "";
        while(s.size()>0){
            result=s.pop()+"/"+result;
        }

        return "/"+result.replaceFirst(".$","");
    }
}