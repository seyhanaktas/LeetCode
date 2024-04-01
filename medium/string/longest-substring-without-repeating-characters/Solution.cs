public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int maxVal= 0;
        for(int i=0;i<s.Length; i++){
            int counter=1;
            int j= i+1;
            string subStr= s[i].ToString();
            while(j<s.Length && !subStr.Contains(s[j].ToString()))
            {
                subStr=subStr+ s[j].ToString();
                j++;
                counter++;
            }
            if(counter>maxVal)
                maxVal=counter;
        }
        return maxVal;
    }
}