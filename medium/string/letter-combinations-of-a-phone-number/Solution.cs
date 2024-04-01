public class Solution {
    List<string> charList= new List<string>{"abc","def","ghi", "jkl","mno", "pqrs", "tuv","wxyz"};
    List<string> addValue(int currentIndex, string digits){
        List<string> res=new List<string>();
        if(String.IsNullOrEmpty(digits))
            return res;
        if(currentIndex==digits.Length-1){
            if(digits[currentIndex]>='2' || digits[currentIndex]<='9'){
                foreach(char c in charList[digits[currentIndex]-'2'].ToCharArray()){
                    res.Add(c.ToString());
                }
                return res;
            }else{
                return null;
            }
        }
        List<string> subRes= addValue(currentIndex+1, digits);
        if(subRes!=null){
            char[] currentList= charList[digits[currentIndex]-'2'].ToCharArray();
            foreach(char c in currentList){
                for(int i=0;i<subRes.Count;i++){
                    res.Add(c.ToString()+subRes[i]);
                }
            }
        }else{
            foreach(char c in charList[digits[currentIndex]-'2'].ToCharArray()){
                    res.Add(c.ToString());
                }
        }
        return res;
    }

    public IList<string> LetterCombinations(string digits) {
        return addValue(0, digits);
    }
}