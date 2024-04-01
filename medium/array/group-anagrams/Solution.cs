public class Solution {
    string ordered(string s){
        List<char> chs= s.ToCharArray().ToList().OrderBy(p=>p).ToList();
        string retVal="";
        foreach(char c in chs){
            retVal+=c.ToString();
        }
        return retVal;
    }

    public IList<IList<string>> GroupAnagrams(string[] strs) {
        IList<IList<string>> res=new List<IList<string>>();
        if(strs.Length==0)
            return res;
        Dictionary<string,List<string>> d =new Dictionary<string, List<string>>();
        for(int i=0; i< strs.Length; i++){
            string str= ordered(strs[i]);
            if(!d.ContainsKey(str)){
                d.Add(str, new List<string>(){strs[i]});
            }else{
                d[str].Add(strs[i]);
            }
        }
        foreach(string key in d.Keys){
            res.Add(d[key]);
        }
        return res;

    }
}